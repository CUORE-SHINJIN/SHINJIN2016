#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/*�\���̂̍쐬*/
typedef struct _Addressbook{
	char Name[32];
	int Age;
	char TelNo[14];
	char Address[128];
} Addressbook;

void structOut(Addressbook *add,char *n,int s){
	int i;
/*main����f�[�^���󂯎���ďo��*/	
	for(i = 0;i < s;i++){
		printf("%d Name=%s Age=%d TelNo=%s Address=%s\n",i+1,add[i].Name,add[i].Age,add[i].TelNo,add[i].Address);
/* :list ���󂯎������main�ɖ߂�*/
		/*if(strcmp(n,":list")==0){
			return;
		}*/
	}
	return;
}

int main ()
{
/*�\���̂̕ϐ��̐錾*/
	Addressbook add[21];
	char n[32];
	int i = 0;
	
/*Name,Age,TelNo,Address�̓���*/
/*�ő�20���ł��̌���͑҂�(�������[�v)*/
	while(1){
		scanf("%s",n);
/* :list �̓��͂Ńf�[�^�o��*/
		if(strcmp(n,":list") != 0 && strcmp(n,":exit") != 0){
			strcpy(add[i].Name,n);
			scanf("%d%s%s",&add[i].Age,add[i].TelNo,add[i].Address);
			i++;
		}
/* :exit �̓��͂Ńv���O�����I��*/
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
