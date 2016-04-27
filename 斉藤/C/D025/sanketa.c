#include<stdio.h>

int main(void)
{
	int x;

	scanf("%d",&x);

	if(x<10){
		printf("00%d\n",x);
	}else if(x>9){
		printf("0%d\n",x);
	}else{
		printf("%d\n",x);
	}
	return 0;
}