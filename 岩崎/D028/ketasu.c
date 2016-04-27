#include<stdio.h>

int main ()
{
	int i;
	char n[6];
	
	scanf("%s",n);
	
	for(i = 0;n[i] != '\0';i++);
		
	printf("%d",i);
	
	return 0;
}