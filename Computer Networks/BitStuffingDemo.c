/* Implement the Data link layer framing method such as BIT STUFFING  */

#include<stdio.h>
#include<string.h>
void main(){
	int a[20], b[20], i, j, k, count, n;
  printf("Enter frame length(max = 20) : ");
  scanf("%d",&n);
  printf("Enter input Frame(0's & 1's only):\n");
  for(i=0; i<n; i++){
      scanf("%d",&a[i]);
  }

  i=0; j=0; count=1;
  while(i<n){
    if(a[i]==1){
      b[j]=a[i];
      for(k=i+1; a[k]==1 && k<n && count<5; k++){
        j++;
        b[j]=a[k];
        count++;
        if(count==5){
          j++;
          b[j]=0;
        }
        i=k;
      }
    }
    else{
      b[j]=a[i];
    }
    i++; 
    j++;
    }
	
  printf("After Stuffing, the frame is : ");
	for(i=0; i<j; i++){
		printf("%d ",b[i]);
	}	
	getch();
}



