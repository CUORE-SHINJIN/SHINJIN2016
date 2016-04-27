#include<stdio.h>

int main()
{
	int n,count=0;
	float s;
	
	scanf("%f",&s);				/*“ü—Í•”*/
	
	n= (int) s;
	
	if(n==s && n>=1 && n<=10000)		/*ðŒ*/
	{
		while(n!=0)
		{
			n=n/10;
			count=count+1;
		}
		printf("%d\n",count);
	}
	else
	{
		printf("error\n");
	}
}
