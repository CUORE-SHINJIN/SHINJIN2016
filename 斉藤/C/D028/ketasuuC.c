#include <stdio.h>
int main(void)
{
	int number;
	int digit=0;

	scanf("%d",&number);
	
	if(number>=0&&number<=10000){
		while(number!=0){
			number=number/10;
			++digit;
		}
		printf("%d\n",digit);
	}else{
		printf("error!");
	}
	return 0;
}
