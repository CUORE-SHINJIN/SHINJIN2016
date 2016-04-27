#include<stdio.h>
int hiki(int nokori){
	int a;
	if(nokori>=0&&nokori<=100){
		a=100-nokori;
		return a;
	}else{
		a=100+nokori;
		return a;
	}
}
int main(void)
{
	int nokori;
	
	scanf("%d",&nokori);
	if(hiki(nokori)<=100){
		printf("%d",hiki(nokori));
	}else{
		printf("error!");
	}
	return 0;
}