#include<stdio.h>

int main()
{
	int a,b,c;

	printf("a\nb\n");
	scanf("%d%d",&a,&b);
	
	if(a <= 179 && a>=1 && b>=1 && b<=179 && a+b<=179 && a+b>=2)
	{	
		c=180-a-b;
		printf("%d\n",c);
	}
	else
	{
		printf("error");
}
}

		