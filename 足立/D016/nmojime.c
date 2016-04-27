#include<stdio.h>

int main(void)
{
	
	int i,a;
	
    char str[256];

    scanf("%s" , str);
    scanf("%d" , &a);

    for(i=0;i<a;i++)
    {    
          printf("%c", str[i]);
    }
  
    return 0;
}