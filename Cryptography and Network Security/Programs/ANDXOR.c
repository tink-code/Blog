#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main(){
char str[]="Hello World";
char str1[15];
char str2[15];
int i,len;
len = strlen(str);
for(i=0;i<len;i++){
	str1[i] = str[i]&127;
	printf("%c",str1[i]);
}
printf("\n");
for(i=0;i<len;i++){
	str2[i] = str[i]^127;
	printf("%c",str1[i]);
}
printf("\n");
}
