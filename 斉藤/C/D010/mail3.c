#include<stdio.h>
#include <string.h>
int mail(char str1[256],char str2[256]){
	int len1,len2;
	len1=strlen(str1);
	len2=strlen(str2);
	if(len1>=1&&len1<=64&&len2>=1&&len2<=64){
		return 1;
	}else{
		return 2;
	}
}
int main(void)
{
	char str1[256],str2[256];

	scanf("%s",str1);
	scanf("%s",str2);
	if(mail(str1,str2)==1){
		printf("%s@%s\n",str1,str2);
	}else{
		printf("error!\n");
	}
	return 0;
}