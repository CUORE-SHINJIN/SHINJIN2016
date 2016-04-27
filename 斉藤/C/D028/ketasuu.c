#include <stdio.h>
 
int main()
{
	int i;
	char suuzi[100];

	scanf("%s",suuzi);

	for(i=0;suuzi[i]!='\0';++i);

	printf("%d\n",i);

	return 0;
}
