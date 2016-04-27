#include<stdio.h>

int main(void)
{
	int y,m,d;
	scanf("%d %d %d",&y,&m,&d);

	if(y>=2000&&y<=2016&&m>=1&&m<=12&&d>=1&&d<=31){
		if(m=4,6,9,11){
			if(d=31){
				printf("error!");
			}
		}
		printf("%d/%d/%d",y,m,d);
	}else{
		printf("error!");
	}
	return 0;
}