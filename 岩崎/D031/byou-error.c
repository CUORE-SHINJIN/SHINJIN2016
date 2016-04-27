#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int n;
	
	scanf("%d",&n);
	
	if(n >= 1 && n <= 100){
		printf("%d",n*60);
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}