#include<stdio.h>/*printf�ȂǂɎg�p*/
#include<string.h>/*strcmp�ȂǂɎg�p*/
/*�\����*/
typedef struct meibo{
	char name[20];/*20��������΂قƂ�ǂ̐l���͓���Ǝv���̂�20������(�w�肪����Ες��܂�)*/
	int age;/*�N��*/
	char tel[14];/*000-0000-0000��NULL��������14������*/
	char adoress[256];/*�Z���͒��߂ɂƂ���256������(�w�肪����Ες��܂�)*/
}meibo_t;/*���̍\���̂̒ʏ�*/

/*�|�C���^�֐�*/
//miki �����ɂ��Ă��������ڂ���
void str(meibo_t *syain,int c){/*�|�C���^�ϐ��ɍ\���̂̐擪�A�h���X��n���Ă���Bint n��main����̎����̈���*/
	//miki �J�E���^
	int i;/*for���̃J�E���^�p*/
	//miki for�̏������������ڂ���
	for(i=0;i<c;i++){/*:list����͂�����̎�O�܂�1���J�E���g�𑝂₵�ČJ��Ԃ�*/
		printf("%d %s %d %s %s\n",i+1,syain[i].name,
		syain[i].age,syain[i].tel,syain[i].adoress);
		/*�ԍ��A�����A�N��A�d�b�ԍ��A�Z����\��*/
	}
}
/*main�֐�*/
int main(void){
	//miki ���������ڂ���
	int c=0;/*�z��̗v�f��(��������0)*/
	//miki ���������ڂ���
	meibo_t syain[20];/*�Z���^��o�^����\���̂̔z��̘g��(�w�肪20���܂łȂ̂�20��)*/
	char insuu[256];/*fgets�p�B���ɕ������̎w�肪�Ȃ������̂łƂ肠����256*/
	char* last;/*�k�������p�̃|�C���^*/
	
	for(;;){/*�������[�v*/
		//miki ���������ڂ���
		fgets(insuu,256,stdin);/*�W�����͂���1�s���uinsuu�v�Ɏ��[*/
		if(insuu[0]==':'){/*�擪�������u�F�v�Ȃ�*/
			//miki ���������ڂ���
			last=strpbrk(insuu,"\r\n");/*fgets�œ��͂����uinsuu�v���ł̍ŏ��̉��s�������ł��擪�A�h���X���ulast�v�Ɏ��[*/
			*last='\0';/*�ulast�v�ɓ������A�h���X�̐�Ƀk����������(����ɂ��u\r\n�v���u\0�v�ɑ�������)*/
			if(strcmp(insuu,":exit")==0){/*���͂��ꂽ���̂��u:exit�v�Ȃ�*/
				return 0;/*�I��*/
			}else if(strcmp(insuu,":list")==0){/*���͂��ꂽ���̂��u:list�v�Ȃ�*/
				//miki �����𑝂₵�đΉ����Ă݂�
				str(syain,c);/*�֐����Ăяo��*/
				continue;/*�J��グ��*/
			}
		}else{/*�擪�������u�F�v�ȊO�Ȃ�*/
			sscanf(insuu,"%s %d %s %s",
			syain[c].name,&syain[c].age,syain[c].tel,syain[c].adoress);
			/*���O�A�N��A�d�b�ԍ��A�Z����fgets�œ��͂����uinsuu�v�������*/
			if(c>=20){/*syain[i]��20�𒴂���(21��)�ɂȂ�����*/
				printf("error!\n");/*�G���[�\��*/
				continue;/*�J��グ��*/
			}
			c++;/*if���ł̔��肪���ׂďI�������c��1�𑫂�*/
		}
	}
}