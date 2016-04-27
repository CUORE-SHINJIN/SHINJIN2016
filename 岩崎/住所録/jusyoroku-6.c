#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/*構造体の作成*/
typedef struct _Addressbook{
	char Name[32];
	int Age;
	char TelNo[14];
	char Address[128];
} Addressbook;

void structOut(Addressbook *add,char *n,int s){
	int i;
/*mainからデータを受け取って出力*/	
	for(i = 0;i < s;i++){
		printf("%d Name=%s Age=%d TelNo=%s Address=%s\n",i+1,add[i].Name,add[i].Age,add[i].TelNo,add[i].Address);
/* :list を受け取ったらmainに戻る*/
		/*if(strcmp(n,":list")==0){
			return;
		}*/
	}
	return;
}

int main ()
{
/*構造体の変数の宣言*/
	Addressbook add[21];
	char n[32];
	int i = 0;
	
/*Name,Age,TelNo,Addressの入力*/
/*最大20件でその後入力待ち(無限ループ)*/
	while(1){
		scanf("%s",n);
/* :list の入力でデータ出力*/
		if(strcmp(n,":list") != 0 && strcmp(n,":exit") != 0){
			strcpy(add[i].Name,n);
			scanf("%d%s%s",&add[i].Age,add[i].TelNo,add[i].Address);
			i++;
		}
/* :exit の入力でプログラム終了*/
		else if(strcmp(n,":exit")==0){
			exit(0);
		}
		else if(strcmp(n,":list")==0){
			structOut(add,n,i);
		}
		
		if(i > 20){
			printf("error",stderr);
			exit(1);
		}
	}
}
