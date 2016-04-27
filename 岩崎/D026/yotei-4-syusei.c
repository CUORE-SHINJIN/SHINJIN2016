#include<stdio.h>
#include<string.h>

int main ()
{
	int i;
	int count = 0;
	char d_1[4];
	
	for(i = 0;i < 7;i++){
		scanf("%s",d_1);
		if(strcmp(d_1,"no") == 0){
			count++;
		}
	}
	printf("%d",count);
	
	return 0;
}