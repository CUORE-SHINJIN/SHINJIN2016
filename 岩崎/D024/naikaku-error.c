#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int a;
	int b;
	
	scanf("%d",&a);
	scanf("%d",&b);
	
	if(a >= 1 && a <= 179 && b >= 1 && b <= 179 && a+b >= 2 && a+b <= 179){
		printf("%d",180 - (a + b));
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}