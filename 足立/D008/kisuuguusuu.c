#include<stdio.h>

int main(void)
{
	int a;
	char str1[] = "even";
	char str2[] = "odd";
	
	scanf("%d",&a);
	
	if(a%2==0)
	{
		printf("%s\n",str1);
    }
    else
    {
    	printf("%s\n",str2);
    }
    
    return 0;
}
