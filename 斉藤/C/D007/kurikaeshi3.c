#include <stdio.h>
int kuri(int n){
	if(n>=1&&n<=100){
		return 1;
	}else{
		return 2;
	}
}
int main(void){
	int n,i;
	
	scanf("%d",&n);
	if(kuri(n)==1){
		for(i=0;i<n;i++){
			printf("%s","*");
		}
	}else{
		printf("error!");
	}
	return 0;
}