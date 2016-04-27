#include <stdio.h>
#include <string.h>

int main(void)
{
	
	int j;
	
	char str1[256];
	char str2[256];
	char str3[256];
	char str4[256];
	char str5[256];
	char str6[256];
	char str7[256];
	
	scanf("%s",str1);
	scanf("%s",str2);
	scanf("%s",str3);
	scanf("%s",str4);
	scanf("%s",str5);
	scanf("%s",str6);
	scanf("%s",str7);
	
	j=0;
	

	if(strcmp(str1,"no")==0)
	{
	    j++;
    }
    if(strcmp(str2,"no")==0)
    {
    	j++;
    }
    if(strcmp(str3,"no")==0)
    {
    	j++;
    }
    if(strcmp(str4,"no")==0)
    {
    	j++;
    }
    if(strcmp(str5,"no")==0)
    {
    	j++;
    }
    if(strcmp(str6,"no")==0)
    {
    	j++;
    }
    if(strcmp(str7,"no")==0)
    {
    	j++;
    }
    
	printf("%d\n",j);
	
	return 0;
}
	
