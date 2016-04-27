#include<stdio.h>
#include<string.h>

int main ()
{
	int count = 0;
	char d_1[4],d_2[4],d_3[4],d_4[4],d_5[4],d_6[4],d_7[4];
	
	scanf("%s%s%s%s%s%s%s",d_1,d_2,d_3,d_4,d_5,d_6,d_7);
	
	if(strcmp(d_1,"no")==0){
		count++;
	}
	if(strcmp(d_2,"no")==0){
		count++;
	}
	if(strcmp(d_3,"no")==0){
		count++;
	}
	if(strcmp(d_4,"no")==0){
		count++;
	}
	if(strcmp(d_5,"no")==0){
		count++;
	}
	if(strcmp(d_6,"no")==0){
		count++;
	}
	if(strcmp(d_7,"no")==0){
		count++;
	}
	
	printf("%d",count);
	
	return 0;
}