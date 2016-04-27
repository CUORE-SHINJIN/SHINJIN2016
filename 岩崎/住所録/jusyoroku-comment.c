#include<stdio.h>				/*標準入出力に関する関数が定義されているヘッダーファイルの取り込み。
									ここではscanf関数、printf関数、stderr(標準エラー出力)を使用するために必要*/
									
#include<stdlib.h>				/*一般ユーティリティ関数とマクロが定義されている（コピペです）ヘッダーファイルの取り込み。
									EXIT-FAILUREを使用していた時のまま消すのを忘れていました。ここでは必要ありません*/
									
#include<string.h>				/*文字列操作に関する関数が定義されているヘッダーファイルの取り込み。
									ここではstrcmp関数、strcpy関数を使用するために必要*/
									

typedef struct _Addressbook{	/*構造体（複数の変数をまとめて格納できる変数の型）の定義。ここから*/
	
	char Name[32];				/*構造体に含まれるchar型の変数 Name の宣言。要素数32byte*/
	int Age;					/*構造体に含まれるint型の変数　Age の宣言。要素数4byte*/
	char TelNo[14];				/*構造体に含まれるchar型の変数　TelNo の宣言。要素数14byte*/
	char Address[128];			/*構造体に含まれるchar型の変数　Address　の宣言。要素数128byte*/
		
} Addressbook;					/*構造体の定義。ここまで*/



void structOut (Addressbook *add,int s){	/*structOut関数の定義。ここから。
											　（戻り値無し、引数:構造体Addressbook型の変数 add（main関数内の変数 add の値を受け取る）、
											　   int型の変数 s（main関数内の変数 i の値を受け取る）)
											　　ここではmain関数で入力されたデータを出力し、再度main関数の無限ループ内に戻る関数*/
	
	int i;						/*int型の変数 i の宣言。データ入力の回数分for文を回すための変数*/
	
	for(i = 0;i < s;i++){		/*0回目からデータ入力分（s回：main関数のwhile分でループした回数。カウンターはmain関数内の変数 i ）までの
	　　　　　　　　　　　　　　　データを出力するための制御文。カウンターはstructOut関数内の変数 i */
	　　　　　　　　　　　　　　　
		printf("%d Name=%s Age=%d TelNo=%s Address=%s\n",i+1,add[i].Name,add[i].Age,add[i].TelNo,add[i].Address);
	}							/*main関数で入力したデータを出力するためのprintf関数の呼び出し*/
		
	return;						/*処理が終了したら何も返さずstructOut関数呼び出し元へ戻る*/
		
}								/*structOut関数の定義。ここまで*/


int main ()		　	/*main関数の定義（戻り値int型、引数無し）。ここから*/
{
	Addressbook add[21];		/*構造体の変数の宣言。上記で定義した構造体がここで意味を持つ*/
	char n[6];					/*char型の変数　n　の宣言。要素数6byte。入力されたデータが「:list」「:exit」「住所録に必要な情報」
									のどれであるかを判別するために用意した変数*/
	int i = 0;					/*int型の変数　i　の宣言。要素数4byte。初期値0*/


	while(1){					/*Name,Age,TelNo,Addressのデータを入力するための無限ループ。ここから*/
		scanf("%s",n);			/*文字列 n の入力待ち。「:list」「:exit」「住所録に必要な情報」のどれであるかを判別するため、
								　先に文字列の入力をひとつ用意する*/
		
		if(strcmp(n,":list") != 0 && strcmp(n,":exit") != 0){		/*文字列 n が「:list」「:exit」と一致しないことを確認。
																		一致しなければそのまま下３行の処理*/
			strcpy(add[i].Name,n);									/*一致しないということは文字列 n は「住所録に必要な情報」なので
																		その情報を構造体の変数add[i].Nameにコピーする。[i]はここでは
																		char型の変数 add.Name の配列の番号を示す*/
																		
			scanf("%d%s%s",&add[i].Age,add[i].TelNo,add[i].Address);	/*残りの情報を add[i].Age,add[i].TelNo,add[i].Addressに入力
																			[i]については同上（add[i].Ageはint型）*/
			i++;				/*カウンター。ここではループ回数を数えるとともに、変数 add[i].*** の配列の番号を一つずつ繰り上げていく
									役割を果たしている*/
									
		}						/*文字列 n が「:list」「:exit」と一致しなかった場合の処理終了*/
			
		else if(strcmp(n,":list") == 0){		/*文字列 n が「:list」と一致した場合の処理を下１行に示す*/
			structOut(add,i);					/*structOut関数を呼び出し、変数 add と変数 int を引数として渡す。
													structOut関数終了後、ここへ戻る*/
		}										/**文字列 n が「:list」と一致した場合の処理終了*/
			
		else if(strcmp(n,":exit") == 0){		/*文字列 n が「:exit」と一致した場合の処理を下１行に示す*/
			exit(0);							/*プログラム正常終了*/
		}										/*文字列 n が「:exit」と一致した場合の処理終了*/
		
		if(i > 20){								/*カウンター　i が20を超えたとき、つまり構造体ひとまとまりの情報が
													20件を超えたときの処理を下2行に示す*/
			printf("error",stderr);				/*「error」を出力するためのprintf関数の呼び出し。stderrは標準エラー出力*/
			exit(1);							/*プログラム異常終了*/
		}										/*カウンター　i が20を超えたとき、つまり構造体ひとまとまりの情報が
													20件を超えたときの処理終了*/
													
	}											/*無限ループの範囲ここまで*/
}												/*main関数の定義ここまで*/