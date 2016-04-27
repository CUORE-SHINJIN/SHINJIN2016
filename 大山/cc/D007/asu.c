#include<stdio.h>

int main()
{
	int n,i;
		
	scanf("%d",&n);
	
	if(n>=1 && n<=100)
	{
		for(i=1;i<n;i++)
		{
			printf("*");
		}
		printf("*\n");
	}
	else
	{
		printf("error\n");
	}
}
