#include <stdio.h>

int main(void)
{
	
	int x, y;
    	    	
	scanf("%d", &x);
	
	if(x>=1&&x<=100)
	{
        y=x*60;
        printf("%d\n",y);
        
    }
    else
    {	
        printf("error");
    }
	return 0;
}