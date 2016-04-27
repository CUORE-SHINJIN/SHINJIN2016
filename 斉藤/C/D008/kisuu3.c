#include<stdio.h>
int suuzi(int x){
	if(x%2==0){
		return 1;
	}else{
		return 2;
	}
}
int main(void)
{
	int x;

	scanf("%d",&x);

	if(suuzi(x)==1){
		printf("even");
	}else{
		printf("odd");
	}
	return 0;
}
