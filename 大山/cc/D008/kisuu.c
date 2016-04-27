#include<stdio.h>

int main()
{
	int n;

	scanf("%d",&n);
	
	if(n<=100 && n>=1)
	{
		if(n%2)
		{
			printf("odd\n");
		}
		else
		{
			printf("even\n");
		}
	}
	else
	{
		printf("error\n");
	}
}
		