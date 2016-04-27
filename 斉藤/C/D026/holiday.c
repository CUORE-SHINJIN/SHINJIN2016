#include<stdio.h>
#include <string.h>

int main(void)
{
	int i,count;
	char yourinput[1024];

	count=0;

	for(i=0;i<7;i++)
	{
		scanf("%s",&yourinput);

		if(!strcmp(yourinput,"no"))
		{
			count++;
		}
	}
	printf("%d\n",count);

	return 0;
}