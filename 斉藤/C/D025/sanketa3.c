#include<stdio.h>
int keta(int x){
	if(x>=1&&x<=100){
		return x;
	}else{
		return 0;
	}
}
int main(void)
{
	int x;

	scanf("%d",&x);
	if(keta(x)!=0){
		printf("%03d\n",keta(x));
	}else{
		printf("error!\n");
	}
	
	return 0;
}