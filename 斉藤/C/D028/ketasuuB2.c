#include<stdio.h>
#include<string.h>
int main(void)
{
	char len,s;
	int i;
	scanf("%s",&s);
		if(s<=10000){
			len=strlen(&s);
			if(len>=1&&len<=5){
				printf("%d\n",len);
			}else{
				printf("error!");
			}
		}else{
			printf("error!");
		}
	return 0;
}
/*課題：文字数計算になっているので-1以下の場合でエラーが出ない*/