#include<stdio.h>

int main(void)
{
	int x;
	scanf("%d",&x);
	if(x>=1&&x<=100){
		if(x%2==0){
			printf("even");
		}else{
			printf("odd");
		}
	}else{
		printf("error!");
	}
	return 0;
}