#include<stdio.h>
#include <string.h>
int mail(char str1[256],char str2[256]){
	int len1,len2,i,flag=1;
	char a[256],b[256];
	len1=strlen(str1);
	len2=strlen(str2);
	if(len1>=1&&len1<=64&&len2>=1&&len2<=64){
		for(i=0;str1[i]!='\0';i++){
			if(str1[i]>=97&&str1[i]<=122||str1[i]>=65&&str1[i]<=90){
				flag=0;
			}else if(str1[i]==46){
				flag=0;
			}else{
				return 2;
			}
		}
	}else{
			return 2;
	}
	if(flag==0){
		for(i=0;str2[i]!='\0';i++){
			if(str2[i]>=97&&str2[i]<=122||str2[i]>=65&&str2[i]<=90){
				return 1;
			}else if(str2[i]==46){
				return 1;
			}else{
				return 2;
			}
		}
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