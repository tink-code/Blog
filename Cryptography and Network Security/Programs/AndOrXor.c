#include<string.h>

void main(){
	char str1[]="Hello DRKIST";
	char str2[50];
	char str3[50];
	int len,i;
	char AND[100], OR[100], XOR[100];
	len=strlen(str1);
	strcpy(str2, str1);
	strcpy(str3, str1);

	clrscr();

	for(i=0; i<len; i++){
		//printf("\n%d OPER %d",str1[i], 127);
		AND[i]=str1[i]&127;
		OR[i]=str2[i]|0;
		XOR[i]=str3[i]^0;
	}

	printf("\nPerforming AND Operation\n");
	for(i=0; i<len; i++){
		printf("%c", AND[i]);
	}

	printf("\n\n\nPerforming OR Operation\n");
	for(i=0; i<len; i++){
		printf("%c",OR[i]);
	}

	printf("\n\n\nPerformaing XOR Operation\n");
	for(i=0; i<len; i++){
		printf("%c", XOR[i]);
	}

	getch();
}

