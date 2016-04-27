#include<stdio.h>

int main(void)
{
	int a,b,c;
	scanf("%d",&a);
	if(a>=1&&a<=179){
		scanf("%d",&b);
		if(b>=1&&b<=179){
			c=180-(a+b);

			printf("%d\n",c);
		}else{
			printf("error!\n");
		}
	}else{
		printf("error!\n");
	}
	
	return 0;
}
