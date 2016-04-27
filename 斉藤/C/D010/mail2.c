#include<stdio.h>
#include<string.h>
int main(void)
{
	char str1[256],str2[256];
	int len1,len2;

	scanf("%s",str1);
	
	len1=strlen(str1);
	
	if(len1>=1&&len1<=64){
		scanf("%s",str2);
		
		len2=strlen(str2);
		
		if(len2>=1&&len2<=64){
			printf("%s@%s\n",str1,str2);
		}else{
			printf("error!\n");
		}
	}else{
		printf("error!\n");
	}
	return 0;
}