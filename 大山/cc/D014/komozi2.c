#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void) 
{
	char src[256];
	char str[256];
	char dst[100]={'\0'};
	int i;
	
	scanf("%s",&src);
	i = 0;

	if( strlen(src)>=1 && strlen(src)<=100)
	{
		while(src[i] != '\0')
		{
			if(src[i]<=122 && src[i]>=97)
			{
				dst[i] = (char)toupper(src[i]);
				i++;
			}
			else
			{
				strcpy(dst,"error");
				break;
			}
		}
		printf("%s\n",dst);
	}
	else
	{
		printf("error\n");
	}
}
