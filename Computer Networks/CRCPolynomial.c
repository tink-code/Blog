#include<stdio.h>

int frame[50],msg[50],key[20]={0},temp[20];
int n,fl,k,ch,i,j;

void main()
{
        void read();
        void crc();
        printf("\n\t\t=== CRC Polynomial ===\n
        read();
        crc();
}

void read()
{
        printf("\nEnter the frame length:");
        scanf("%d",&fl);
        printf("\nEnter the frame:");
        for(i=0;i<fl;i++)
        scanf("%d",&frame[i]);
        printf("\nChoose any CRC Polynomial\n1:CRC-10\t2:CRC-16\t3:CRC-CCIT\n");
        scanf("%d",&ch);
        
        if(ch==1)
        {
                key[0]=key[1]=key[9]=key[10]=key[11]=key[12]=1;
                k=13;
        }

        else if(ch==2)
        {
                key[0]=key[1]=key[14]=key[16]=1;
                k=17;
        }

        else if(ch==3)
        {
                key[0]=key[1]=key[11]=key[16]=1;
                k=17;
        }

        else
                printf("\nInvalid Choice");

        n=fl+k-1;
        printf("\nPolynomial = ");

        for(i=0;i<k;i++)
                printf("%d",key[i]);
}

void crc()
{
        int i,g;
        void xor(int);
        for(g=1;g<k;g++)
        temp[g]=msg[g];

        for(i=0;i<fl;i++)
        {
                if(temp[0]==0)
                        xor(0);
                else
                {
                if(temp[0]==1)
                        xor(1);
                if(i!=fl)
                        temp[k-1]=msg[g++];
                }
        }

        printf("\nCheck Sum = ");

        for(i=fl,j=0;i<n;i++,j++)
                msg[i]=temp[j];
                for(i=0;i<k;i++)
                        printf("%d",msg[i]);
        printf("\n");
}

void xor(int x)
{
        for(i=1;i<k;i++)
                temp[i-1]=(x==0)?temp[i]^0:temp[i]^key[i];
}
