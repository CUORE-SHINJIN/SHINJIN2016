#include <stdio.h>
#include<string.h>
int main(void)
{

	char str1[256];
	char str2[256];
	
	scanf("%s",str1);
	
	scanf("%s",str2);
	if((strlen(str1)>=1&&strlen(str1)<=64)&&(strlen(str2)>=1&&strlen(str2)<=64))
	{
		printf("%s@%s\n",str1 ,str2);
	}
	else
	{
		printf("error");
	}

	return 0;
}