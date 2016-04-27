#include<stdio.h>
#include<string.h>
int yasumi(char input[4]){
	if(!strcmp(input,"no")){
		return 0;
	}else if(!strcmp(input,"yes")){
		return 1;
	}else{
		return 2;
	}
}
int main(void){
	char input[4];
	int i,count;

	count=0;

	for(i=0;i<7;i++){
		scanf("%s",&input);
		
		if(yasumi(input)==0){
			count++;
		}else if(yasumi(input)==1){
			count+0;
		}else{
			printf("error!\n");
			return 0;
		}
	}
	printf("%d\n",count);

	return 0;
}