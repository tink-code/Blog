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
		printf("\n===== M E N U =====\n");
		printf("\n1: Data Encryption\t\n\n2: Data Decryption\t\n\n3: Exit");
		printf("\n\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
		case 1: printf("\nData Encryption");
				printf("\nEnter the plain text:");
				fflush(stdin);
				gets(plain);
				printf("\nEnter the encryption key:");
				gets(key);
				lp=strlen(key);
				for(i=0;plain[i]!='\0';i++)
					cipher[i]=plain[i]^lp;
				cipher[i]='\0';
				printf("\nThe encrypted text is:");
				puts(cipher);		
				break;
		
		case 2: printf("\nData decryption");
				for(i=0;cipher[i]!='\0';i++)
					plain[i]=cipher[i]^lp;
				printf("\nDecrypted text is:");
				puts(plain);
				break;
		
		case 3: exit(0);
		}
	}
	getch();
}

