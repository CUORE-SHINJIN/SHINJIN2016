#include<stdio.h>

int main ()
{
	int i;
	int n;
	char s[101];
	
	scanf("%s",s);
	scanf("%d",&n);
	
	for(i = 0;i < n;i++){
		printf("%c",s[i]);
	}
	return 0;
}