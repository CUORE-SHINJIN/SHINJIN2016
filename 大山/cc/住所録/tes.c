#include<stdio.h>
#include<string.h>

int main()
{
	int i;
	char str[256];
	char *last;
	char mozi[256];
	char a[10];
		
	fgets(str,256,stdin);			//配列サイズ256までの入力をstrへ格納
	
	last=strpbrk(str,"\n");			//strの配列の最後の改行の位置(アドレス)
	
	*last='\0';						//上記で得たアドレスに'\0'を格納
									//文字列とするために終端文字を持たせる	
									
	if(strcmp(str,":list")==0)		//文字列としたので比較できる
	{
		sscanf(str,"%s",a);
									//strから変換指定に従って引数に格納
	}
	
	printf("%s\n",str);				//str内を変換指定に従って出力
	
	printf("%s\n",a);	//書式文字列に従って標準出力に出力
}