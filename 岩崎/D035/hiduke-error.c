#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int y,m,d;
	
	scanf("%d%d%d",&y,&m,&d);
	
	if(y >= 2000 && y <= 2016 && m >= 1 && m <= 12 && d >= 1 && d <= 31){
		printf("%d/%d/%d",y,m,d);
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}