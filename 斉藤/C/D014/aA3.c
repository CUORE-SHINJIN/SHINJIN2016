#include<stdio.h>
#include<string.h>
int mozi(char str[100]){
	int i;
	int len=strlen(str);
	if(len>=1&&len<=100){
		for(i=0;str[i]!='\0';i++){
			if(str[i]>=97&&str[i]<=122){
				str[i]=str[i]-32;
			}else{
				return 2;
			}
		}
		printf("%s\n",str);
		return 0;
	}else{
		return 2;
	}
}
int main(void)
{
	char str[100];
	
	scanf("%s",str);
	if(mozi(str)==0){
		return 0;
	}else{
		printf("error!\n");
	}
		return 0;
}