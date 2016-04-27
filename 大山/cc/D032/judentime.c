#include<stdio.h>

int main()
{
	int n,b;
	printf("n\n");
	scanf("%d",&n);

	if(n>=0 && n<=100)
	{
		b=100-n;
		printf("%d",b);
	}
	else
	{
		printf("error\n");
}

}


