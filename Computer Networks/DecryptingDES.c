/* 
Take a 64 bit Plain text and encrypt the same using DES algorithm. (refer EncrytionDES.c)
Now, write a program to break the above DES coding.
*/

#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>

void main()
{
	char enc[20];
	char alpha[26]="abcdefghijklmnopqrstuvwxyz";
	int num[20],i,n,key;
	clrscr();
	printf("\nEnter the Decrypted text:");
	scanf("%s",&enc);
	n=strlen(enc);
	for(i=0;i<n;i++)
		num[i]=toascii(tolower(enc[i]))-'a';
	printf("\nEnter the key:");
	scanf("%d",&key);
	for(i=0;i<n;i++)
		num[i]=(num[i]+key)%26;
	for(i=0;i<n;i++)
		enc[i]=alpha[num[i]];
	//printf("\nThe key is:%d",key);
	printf("\nPlain text is:%s",enc);
	for(i=0;i<n;i++)
	{
		num[i]=(num[i]-key)%26;
		if(num[i]<0)
			num[i]=26+num[i];
		enc[i]=alpha[num[i]];
	}
	//printf("\nEncrypted text is : %s",enc);
	getch();
}
