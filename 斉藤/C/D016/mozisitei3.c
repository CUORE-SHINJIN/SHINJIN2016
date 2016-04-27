#include<stdio.h>
#include <string.h>
int mozi(char input[256],int mozisuu){
	char copy[256];
	int len=strlen(input);
	if(len>=1&&len<=100&&len>mozisuu){
		strncpy(copy,input,mozisuu);
		copy[mozisuu]='\0';
		printf("%s\n",copy);
		return 0;
	}else{
		return 1;
	}
}
int main(void){
	char input[256];
	int mozisuu;
	
	scanf("%s",&input);
	scanf("%d",&mozisuu);
	switch(mozi(input,mozisuu)){
		case 0:
			return 0;
		case 1:
			printf("error!\n");
			return 0;
	}
}