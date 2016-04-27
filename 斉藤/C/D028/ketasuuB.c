#include<stdio.h>
#include<string.h>
int main(void)
{
	char len,s;

	scanf("%s",&s);

	len=strlen(&s);
	printf("%d\n",len);

	return 0;
}