#include<stdio.h>
#include<string.h>

int main()
{
	int i,count=0;
	char str[256];
	
	for(i=1;i<=7;i++)
	{
		scanf("%s",&str);
		
		if(strcmp(str,"no")==0)
		{
			count=count+1;
		}
		else if(strcmp(str,"yes")!=0)
		{
			printf("error\n");
			return 0;
		}
	}
	printf("%d\n",count);
}