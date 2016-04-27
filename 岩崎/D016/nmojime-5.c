#include<stdio.h>
#include<string.h>

int main ()
{
	int n;
	char s[101];
	char t[101];
	
	scanf("%s",s);
	scanf("%d",&n);
	
	strncpy(t,s,n);
	if(n < strlen(s)){
		t[n] = '\0';
	}
	printf("%s",t);
	
	return 0;
}