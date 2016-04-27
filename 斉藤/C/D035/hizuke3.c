#include<stdio.h>
#include <string.h>
int cheak(int y,int m,int d){
	if(y>=2000&&y<=2016&&m>=1&&m<=12&&d>=1&&d<=31){
		return 1;
	}else{
		return 2;
	}
}
int main(void)
{
	int y,m,d;
	scanf("%d %d %d",&y,&m,&d);
	if(cheak(y,m,d)==1){
		printf("%d/%d/%d\n",y,m,d);
	}else{
		printf("error!\n");
	}
	return 0;
}