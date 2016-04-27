#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int n;
	
	scanf("%d",&n);
	
	if(n >= 0 && n <= 100){
		printf("%d",100-n);
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}