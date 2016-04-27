#include <stdio.h>

void main()
{
	int n,i;
	
	scanf("%d",&n);
	
	if(n>=1&&n<=100){
		for(i=0;i<n;i++){
			printf("*");
		}
	}else{
		printf("error!");
	}
	return;
}