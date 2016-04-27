#include<stdio.h>
#include<ctype.h>

int main ()
{
	char buff[101];
	char *s;
	
	s = buff;

    scanf("%s",buff);
		
	while(*s){
		*s = toupper(*s);
		++s;
	
	}
      
    printf("%s",buff);
  }
 