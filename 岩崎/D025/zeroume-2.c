#include<stdio.h>

int main ()
{
	int n;
	
	scanf("%d",&n);
	
	if(0 < n && n < 10){
		printf("00%d",n);
	}
	else if(9 < n && n < 100){
		printf("0%d",n);
	}
	else if(n = 100){
		printf("%d",n);
	}
	return 0;
}