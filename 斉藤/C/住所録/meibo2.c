#include<stdio.h>/*printfなどに使用*/
#include<string.h>/*strcmpなどに使用*/
/*構造体*/
typedef struct meibo{
	char name[20];/*20文字あればほとんどの人名は入ると思うので20文字分(指定があれば変えます)*/
	int age;/*年齢*/
	char tel[14];/*000-0000-0000とNULL文字文で14文字分*/
	char adoress[256];/*住所は長めにとって256文字分(指定があれば変えます)*/
}meibo_t;/*この構造体の通称*/

/*ポインタ関数*/
//miki 引数についてもう少し詳しく
void str(meibo_t *syain,int c){/*ポインタ変数に構造体の先頭アドレスを渡している。int nはmainからの実数の引数*/
	//miki カウンタ
	int i;/*for文のカウンタ用*/
	//miki forの条件もう少し詳しく
	for(i=0;i<c;i++){/*:listを入力した回の手前まで1ずつカウントを増やして繰り返す*/
		printf("%d %s %d %s %s\n",i+1,syain[i].name,
		syain[i].age,syain[i].tel,syain[i].adoress);
		/*番号、氏名、年齢、電話番号、住所を表示*/
	}
}
/*main関数*/
int main(void){
	//miki もう少し詳しく
	int c=0;/*配列の要素数(初期化で0)*/
	//miki もう少し詳しく
	meibo_t syain[20];/*住所録を登録する構造体の配列の枠数(指定が20件までなので20個分)*/
	char insuu[256];/*fgets用。特に文字数の指定がなかったのでとりあえず256*/
	char* last;/*ヌル文字用のポインタ*/
	
	for(;;){/*無限ループ*/
		//miki もう少し詳しく
		fgets(insuu,256,stdin);/*標準入力した1行を「insuu」に収納*/
		if(insuu[0]==':'){/*先頭文字が「：」なら*/
			//miki もう少し詳しく
			last=strpbrk(insuu,"\r\n");/*fgetsで入力した「insuu」内での最初の改行文字がでた先頭アドレスを「last」に収納*/
			*last='\0';/*「last」に入ったアドレスの先にヌル文字を代入(これにより「\r\n」が「\0」に代入される)*/
			if(strcmp(insuu,":exit")==0){/*入力されたものが「:exit」なら*/
				return 0;/*終了*/
			}else if(strcmp(insuu,":list")==0){/*入力されたものが「:list」なら*/
				//miki 引数を増やして対応してみる
				str(syain,c);/*関数を呼び出す*/
				continue;/*繰り上げる*/
			}
		}else{/*先頭文字が「：」以外なら*/
			sscanf(insuu,"%s %d %s %s",
			syain[c].name,&syain[c].age,syain[c].tel,syain[c].adoress);
			/*名前、年齢、電話番号、住所をfgetsで入力した「insuu」から入力*/
			if(c>=20){/*syain[i]が20を超える(21個目)になったら*/
				printf("error!\n");/*エラー表示*/
				continue;/*繰り上げる*/
			}
			c++;/*if文での判定がすべて終わったらcに1を足す*/
		}
	}
}