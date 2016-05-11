#include <stdio.h>
#include<string.h>

// 構造体の型枠宣言
typedef struct 
{
	// name:名前
	// age:年齢
	// tel:電話番号
	// add：住所
	char name[20];
	int age;
	char tel[20];
	char add[50];
}addlist;
	

// 関数の定義（引数）
// 引数にて渡されたデータを出力。
// n:入力データ件数

void output(addlist a[20],int n)
{
	int i;

	for(i=0;i<n;i++)
	{
		printf("%d,Name=%s,Age=%d,Tel=%s,Add=%s\n",i+1,a[i].name,a[i].age,a[i].tel,a[i].add);
	}

}

// 簡易住所録のアプリ
int main(void)
{
	// 構造体の宣言
	addlist a[20];

	// 入力データ件数の保存場所
	int n=0;

	// 一時的な保存場所
	char tmpName[20];

	// 無限ループ
	while(1)
	{
		scanf("%s",tmpName);
		if(strcmp(tmpName,":list")==0)
		{
			// もし:listと入力されたら、入力された名前・年齢・電話番号・住所・件数
			// を関数に渡す。
			output (a,n);
		}
		else if(strcmp(tmpName,":exit")==0)
		{
			// もし:exitと入力されたら、プログラムを終了させる。
			return 0;
		}
		else if(n<20)
		{
			// もし入力データ件数が２０件以下ならば、入力されたデータを保存。
			// 入力データ件数を＋１する。
			scanf("%d",&a[n].age);
			scanf("%s",a[n].tel);
			scanf("%s",a[n].add);
			
			strcpy(a[n].name,tmpName);
			
			n++;
		}
	}
}
