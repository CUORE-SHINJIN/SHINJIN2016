#include<stdio.h>

int main(void)
{
	int genzai,nokori;
	
	scanf("%d",&genzai);
	
	if(genzai>=0&&genzai<=100){
		nokori=100-genzai;

		printf("%d",nokori);
	}else{
		printf("error!");
	}
	return 0;
}