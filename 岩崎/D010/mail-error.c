#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main ()
{
	char s[65];
	char t[65];
	char u = '.';
	
	scanf("%s%s",s,t);
	
	if(strlen(s) >= 1 && strlen(s) <= 64 && strlen(t) >= 1 && strlen(t) <= 64 && strchr(t,u) != NULL){
		printf("%s@%s",s,t);
	} else {
		printf("Error",stderr);
		return EXIT_FAILURE;
	}
	return 0;
}