#include<stdio.h>
#include<string.h>

int main ()
{
	int i;
	int count = 0;
	char d_1[4];
	
	for(i = 0;i < 7;i++){
		scanf("%s",d_1);
		if(strlen(d_1) < 3){
			count++;
		}
	}
	printf("%d",count);
	
	return 0;
}