#include<stdio.h>
int mult(int byo){
	int a;
	if(byo>=1&&byo<=100){
		a=byo*60;
		return a;
	}else{
		return 1;
	}
}
int main(void)
{
	int byo,a;
		
	scanf("%d",&byo);
	a=mult(byo);
	if(a!=1){
		printf("%d",a);
	}else{
		printf("error!");
	}
	return 0;
}
