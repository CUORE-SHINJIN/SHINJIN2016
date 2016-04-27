#include <stdio.h>

int keta(int number){
	int digit=0;
	if(number>=1&&number<=10000){
		while(number!=0){
			number=number/10;
			++digit;
		}
		return digit;
	}else{
		return 6;
	}
}
int main(void){
	int number;
	scanf("%d",&number);
	if(keta(number)!=6){
		printf("%d\n",keta(number));
	}else{
		printf("error!");
	}
	return 0;
}
