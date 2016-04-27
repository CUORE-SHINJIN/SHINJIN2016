#include<stdio.h>

int main()
{
	int a,b,c;
	printf("a b\n") ;         /*  “ü—Í•”•ª@@*/
		scanf("%d%d",&a,&b);
	
	if(a>=1 && b<=2014 &&a<b)
	{
		c=b-a;
		printf("%d",c);
	}
	else
	{
		printf("error");
}
}

