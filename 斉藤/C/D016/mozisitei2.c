#include<stdio.h>
#include <string.h>

int main()
{
	char input[256],copy[256],len;
	int mozisuu;
	
	scanf("%s",&input);
	
	len=strlen(input);
	
	if(len>=1&&len<=100){
		scanf("%d",&mozisuu);
		if(mozisuu>=1&&mozisuu<=len){
			strncpy(copy,input,mozisuu);
			copy[mozisuu]='\0';
			printf("%s\n",copy);
		}else{
			printf("error!\n");
		}
	}else{
		printf("error!\n");
	}
}