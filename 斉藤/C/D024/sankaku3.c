#include<stdio.h>
int nihen(int a,int b){
	int c;
	if(a>=1&&a<=179&&b>=1&&b<=179){
		c=180-a-b;
		return c;
	}else{
		c=180;
			return c;
	}
}
int main(void)
{
	int a,b;
	
	scanf("%d",&a);
	scanf("%d",&b);
	if(nihen(a,b)<180){
		printf("%d\n",nihen(a,b));
	}else{
		printf("error!\n");
	}
	return 0;
}
