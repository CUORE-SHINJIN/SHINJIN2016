#include<stdio.h>
#include <string.h>

int main(void)
{
	int i,count,flag;
	char input[256];

	count=0;
	flag=0;

	for(i=0;i<=6;i++)
	{
		scanf("%s",&input);
		if(!strcmp(input,"yes")){
			count+0;
		}else if(!strcmp(input,"no")){
			count++;
		}else{
			printf("error!\n");
			flag=1;
			break;
		}
	}
	if(flag==0){
		printf("%d\n",count);
	}
	return 0;
}