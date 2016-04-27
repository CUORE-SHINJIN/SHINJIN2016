#include<stdio.h>
int hiki(int a,int b){
	if(a>=1&&b<=2014&&a<b){
		int c=b-a;
		return c;
	}else{
		return 2015;
	}
}
int main(void)
{
	int a,b;
	scanf("%d %d",&a,&b);
	if(hiki(a,b)!=2015){
		printf("%d\n",hiki(a,b));
	}else{
		printf("error!");
	}
	return 0;
}