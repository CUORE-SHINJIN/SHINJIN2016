#include<stdio.h>
#include <string.h>

int main()
{
	char input[256],copy[256];
	int mozisuu;
	
	scanf("%s",&input);
	scanf("%d",&mozisuu);

	strncpy(copy,input,mozisuu);
	copy[mozisuu]='\0';
	printf("%s\n",copy);
}