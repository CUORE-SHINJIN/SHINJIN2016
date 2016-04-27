#include<stdio.h>

int main(void)
{
	int hun,byo;

	scanf("%d",&hun);
	
	if(hun>=1&&hun<=100){
		byo=hun*60;
		
		printf("%d",byo);
	}else{

		printf("error!");
	}
	return 0;
}