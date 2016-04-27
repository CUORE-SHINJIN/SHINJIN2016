#include<stdio.h>				/*�W�����o�͂Ɋւ���֐�����`����Ă���w�b�_�[�t�@�C���̎�荞�݁B
									�����ł�scanf�֐��Aprintf�֐��Astderr(�W���G���[�o��)���g�p���邽�߂ɕK�v*/
									
#include<stdlib.h>				/*��ʃ��[�e�B���e�B�֐��ƃ}�N������`����Ă���i�R�s�y�ł��j�w�b�_�[�t�@�C���̎�荞�݁B
									EXIT-FAILURE���g�p���Ă������̂܂܏����̂�Y��Ă��܂����B�����ł͕K�v����܂���*/
									
#include<string.h>				/*�����񑀍�Ɋւ���֐�����`����Ă���w�b�_�[�t�@�C���̎�荞�݁B
									�����ł�strcmp�֐��Astrcpy�֐����g�p���邽�߂ɕK�v*/
									

typedef struct _Addressbook{	/*�\���́i�����̕ϐ����܂Ƃ߂Ċi�[�ł���ϐ��̌^�j�̒�`�B��������*/
	
	char Name[32];				/*�\���̂Ɋ܂܂��char�^�̕ϐ� Name �̐錾�B�v�f��32byte*/
	int Age;					/*�\���̂Ɋ܂܂��int�^�̕ϐ��@Age �̐錾�B�v�f��4byte*/
	char TelNo[14];				/*�\���̂Ɋ܂܂��char�^�̕ϐ��@TelNo �̐錾�B�v�f��14byte*/
	char Address[128];			/*�\���̂Ɋ܂܂��char�^�̕ϐ��@Address�@�̐錾�B�v�f��128byte*/
		
} Addressbook;					/*�\���̂̒�`�B�����܂�*/



void structOut (Addressbook *add,int s){	/*structOut�֐��̒�`�B��������B
											�@�i�߂�l�����A����:�\����Addressbook�^�̕ϐ� add�imain�֐����̕ϐ� add �̒l���󂯎��j�A
											�@   int�^�̕ϐ� s�imain�֐����̕ϐ� i �̒l���󂯎��j)
											�@�@�����ł�main�֐��œ��͂��ꂽ�f�[�^���o�͂��A�ēxmain�֐��̖������[�v���ɖ߂�֐�*/
	
	int i;						/*int�^�̕ϐ� i �̐錾�B�f�[�^���͂̉񐔕�for�����񂷂��߂̕ϐ�*/
	
	for(i = 0;i < s;i++){		/*0��ڂ���f�[�^���͕��is��Fmain�֐���while���Ń��[�v�����񐔁B�J�E���^�[��main�֐����̕ϐ� i �j�܂ł�
	�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�f�[�^���o�͂��邽�߂̐��䕶�B�J�E���^�[��structOut�֐����̕ϐ� i */
	�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@
		printf("%d Name=%s Age=%d TelNo=%s Address=%s\n",i+1,add[i].Name,add[i].Age,add[i].TelNo,add[i].Address);
	}							/*main�֐��œ��͂����f�[�^���o�͂��邽�߂�printf�֐��̌Ăяo��*/
		
	return;						/*�������I�������牽���Ԃ���structOut�֐��Ăяo�����֖߂�*/
		
}								/*structOut�֐��̒�`�B�����܂�*/


int main ()		�@	/*main�֐��̒�`�i�߂�lint�^�A���������j�B��������*/
{
	Addressbook add[21];		/*�\���̂̕ϐ��̐錾�B��L�Œ�`�����\���̂������ňӖ�������*/
	char n[6];					/*char�^�̕ϐ��@n�@�̐錾�B�v�f��6byte�B���͂��ꂽ�f�[�^���u:list�v�u:exit�v�u�Z���^�ɕK�v�ȏ��v
									�̂ǂ�ł��邩�𔻕ʂ��邽�߂ɗp�ӂ����ϐ�*/
	int i = 0;					/*int�^�̕ϐ��@i�@�̐錾�B�v�f��4byte�B�����l0*/


	while(1){					/*Name,Age,TelNo,Address�̃f�[�^����͂��邽�߂̖������[�v�B��������*/
		scanf("%s",n);			/*������ n �̓��͑҂��B�u:list�v�u:exit�v�u�Z���^�ɕK�v�ȏ��v�̂ǂ�ł��邩�𔻕ʂ��邽�߁A
								�@��ɕ�����̓��͂��ЂƂp�ӂ���*/
		
		if(strcmp(n,":list") != 0 && strcmp(n,":exit") != 0){		/*������ n ���u:list�v�u:exit�v�ƈ�v���Ȃ����Ƃ��m�F�B
																		��v���Ȃ���΂��̂܂܉��R�s�̏���*/
			strcpy(add[i].Name,n);									/*��v���Ȃ��Ƃ������Ƃ͕����� n �́u�Z���^�ɕK�v�ȏ��v�Ȃ̂�
																		���̏����\���̂̕ϐ�add[i].Name�ɃR�s�[����B[i]�͂����ł�
																		char�^�̕ϐ� add.Name �̔z��̔ԍ�������*/
																		
			scanf("%d%s%s",&add[i].Age,add[i].TelNo,add[i].Address);	/*�c��̏��� add[i].Age,add[i].TelNo,add[i].Address�ɓ���
																			[i]�ɂ��Ă͓���iadd[i].Age��int�^�j*/
			i++;				/*�J�E���^�[�B�����ł̓��[�v�񐔂𐔂���ƂƂ��ɁA�ϐ� add[i].*** �̔z��̔ԍ�������J��グ�Ă���
									�������ʂ����Ă���*/
									
		}						/*������ n ���u:list�v�u:exit�v�ƈ�v���Ȃ������ꍇ�̏����I��*/
			
		else if(strcmp(n,":list") == 0){		/*������ n ���u:list�v�ƈ�v�����ꍇ�̏��������P�s�Ɏ���*/
			structOut(add,i);					/*structOut�֐����Ăяo���A�ϐ� add �ƕϐ� int �������Ƃ��ēn���B
													structOut�֐��I����A�����֖߂�*/
		}										/**������ n ���u:list�v�ƈ�v�����ꍇ�̏����I��*/
			
		else if(strcmp(n,":exit") == 0){		/*������ n ���u:exit�v�ƈ�v�����ꍇ�̏��������P�s�Ɏ���*/
			exit(0);							/*�v���O��������I��*/
		}										/*������ n ���u:exit�v�ƈ�v�����ꍇ�̏����I��*/
		
		if(i > 20){								/*�J�E���^�[�@i ��20�𒴂����Ƃ��A�܂�\���̂ЂƂ܂Ƃ܂�̏��
													20���𒴂����Ƃ��̏�������2�s�Ɏ���*/
			printf("error",stderr);				/*�uerror�v���o�͂��邽�߂�printf�֐��̌Ăяo���Bstderr�͕W���G���[�o��*/
			exit(1);							/*�v���O�����ُ�I��*/
		}										/*�J�E���^�[�@i ��20�𒴂����Ƃ��A�܂�\���̂ЂƂ܂Ƃ܂�̏��
													20���𒴂����Ƃ��̏����I��*/
													
	}											/*�������[�v�͈̔͂����܂�*/
}												/*main�֐��̒�`�����܂�*/