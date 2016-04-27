#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int a;
	int b;
	
	scanf("%d%d",&a,&b);
	
	if(a >= 1 && b <= 2014 && a < b){
		printf("%d",b - a);
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}