#include<stdio.h>

int main(void)
{
	int x;

	scanf("%d",&x);

	if(x>=1&&x<=100){
		if(x<=9){
			printf("00%d\n",x);
		}else if(x>=10&&x<100){
			printf("0%d\n",x);
		}else{
			printf("%d\n",x);
		}
	}else{
		printf("error!\n");
	}
	return 0;
}