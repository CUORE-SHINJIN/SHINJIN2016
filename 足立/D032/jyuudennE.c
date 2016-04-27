#include <stdio.h>

int main(void)
{
	
	int x, y, n;
	
	scanf("%d", &x);
	
	if(x>=0&&x<=100)
	{	
	    y=100-x;
	    n=y/1;
	    printf("%d\n",n);
	}
	else
	{
		printf("error");
	}
	return 0;
}