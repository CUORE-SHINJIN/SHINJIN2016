#include<stdio.h>

int main()
{
	int n;
	float s;
	
	scanf("%f",&s);
	
	n=(int)s;
	
	if(n==s && n>=1 && n<=100)
	{
		if(n<=9 && n>=1)
		{
			printf("00%d\n",n);
		}
		else if(n<=99 && n>=10)
		{
			printf("0%d\n",n);
		}
		else
		{
			printf("%d\n",n);
		}
	}
	else
	{
		printf("error\n");
	}
}
