#include<stdio.h>

int main()
{
	int y,m,d;

	scanf("%d%d%d",&y,&m,&d);
	
	if(y<=2016 && y>=2000 && m<=12 &&m>=1 && d<=31 && d>=1)
	{
		printf("%d/%d/%d\n",y,m,d);
	}
	else
	{
		printf("error");
	}
}
