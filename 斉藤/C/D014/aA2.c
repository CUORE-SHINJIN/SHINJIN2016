#include<stdio.h>
#include<string.h>

int main(void)
{
	int i,len;
	char str[256];
	
	scanf("%s",str);
	
	len=strlen(str);
	
	if(len>=1&&len<=100){
		for(i=0;i<=strlen(str);i++){
			if(str[i]>=97&&str[i]<=122)
			str[i]=str[i]-32;
		}
			printf("%s\n",str);
	}else{
		printf("error!\n");
	}
	return 0;
}