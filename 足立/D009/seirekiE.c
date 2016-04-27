#include <stdio.h>

int main(void)
{
	
	int a, b, c;
	
	scanf("%d", &a);
	
	scanf("%d", &b);

	if((a<b)&&(a>=1&&b<=2014))	
	{	c=b-a;
		printf("%d\n", c);
	}	
	else
	{
		printf("error");
	}

}