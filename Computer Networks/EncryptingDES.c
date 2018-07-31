/* Take a 64 bit Plain Text and Encrypt the same using DES Algorithm */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
void main()
{
    int i,ch,lp;
    char cipher[50],plain[50];
    char key[50];
    clrscr();
    while(1)
    {
        printf("\n==== MENU ====\n");
        printf("\n1: Data Encryption\t\n\n2: Data Decryption\t\n\n3: Exit");
        printf("\n\nEnter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case1:  printf("\nData Encryption")
                    printf("\nEnter the Plaintext : ");
                    fflush(stdin);
                    gets(plain);
                    printf("\nEnter the Encryption Key : ");
                    gets(key);
                    lp=strlen(key);
                    for(i=0;plain[i]!='\0';i++)
                        cipher[i]=plain[i]^lp;
                    cipher[i]='\0';
                    printf("\nThe Encrypted Text is : ");
                    puts(cipher);
                break;
            
            case2:  printf("\nData Decryption");
                    for(i=0;cipher[i]!='\0';i++)
                        plain[i]=cipher[i]^lp;
                    printf("\nDecrypted Text is : ");
                    puts(plain);
                break;
            
            case3:
                exit(0);
        }
    }
getch();
}
