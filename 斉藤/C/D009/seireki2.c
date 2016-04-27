#include<stdio.h>

int main(void)
{
	int a,b,c;
	scanf("%d %d",&a,&b);
	if(a>=1&&b<=2014&&a<b){
		c=b-a;
		printf("%d\n",c);
	}else{
		printf("error!");
	}
	return 0;
}