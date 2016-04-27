#include <stdio.h>
#include <string.h>

int main(void)
{
	
	int i,j;
	j=0;
	
	char str[256];
	
	for(i=0;i<7;i++)
	{
		scanf("%s",str);
	    if(strcmp(str,"no")==0)
        {
	        j++;
        }
     }
 
    printf("%d\n",j);
     
    return 0;
}
