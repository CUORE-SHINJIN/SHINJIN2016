#include <stdio.h>

int main(void)
{

    int a, b, c, d;
    
    scanf("%d", &a);
    	
    scanf("%d", &b);
    
    if((a>=1 && a<=179) && (b>=1 && b<=179) && (c>=2&&c<=179))
    {
    		c=a+b;
    		d=180-c;
            printf("%d\n",d);
    }
           else
           {
    	       printf("error");
    	   }
    return 0;
}