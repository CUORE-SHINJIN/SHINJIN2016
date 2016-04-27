#include<stdio.h>
#include<string.h>
#include <ctype.h>
 
int main(void){
	int i,len;
	char str[256],str2[100]={'\0'};

	scanf("%s",str);
	len=strlen(str);
	if(len>=1&&len<=100){
		for(i=0;str[i]!='\0';i++){
			if(str[i]>=97&&str[i]<=122){
				str[i]=str[i]-32;
			}else{
				printf("error!");
				return 0;
			}
		}
		printf("%s\n",str);
	}else{
		printf("error!\n");
	}
	return 0;
}