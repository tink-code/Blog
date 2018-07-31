#include<stdio.h>
#include<stdlib.h>
#include<string.h>
voidmain()
{
    inti,ch,lp;
    charcipher[50],plain[50];
    charkey[50];
    clrscr();
    while(1)
    {
        printf("\n==== MENU ====\n");
        printf("\n1:DataEncryption\t\n\n2:DataDecryption\t\n\n3:Exit");
        printf("\n\nEnteryourchoice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case1:  printf("\nDataEncryption")
                    printf("\nEntertheplaintext:");
                    fflush(stdin);
                    gets(plain);
                    printf("\nEntertheencryptionkey:");
                    gets(key);
                    lp=strlen(key);
                    for(i=0;plain[i]!='\0';i++)
                        cipher[i]=plain[i]^lp;
                    cipher[i]='\0';
                    printf("\nTheencryptedtextis:");
                    puts(cipher);
                break;
            
            case2:  printf("\nDatadecryption");
                    for(i=0;cipher[i]!='\0';i++)
                        plain[i]=cipher[i]^lp;
                    printf("\nDecryptedtextis:");
                    puts(plain);
                break;
            
            case3:
                exit(0);
        }
    }
getch();
}
