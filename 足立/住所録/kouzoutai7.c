#include <stdio.h>
#include<string.h>

// �\���̂̌^�g�錾
typedef struct 
{
	// name:���O
	// age:�N��
	// tel:�d�b�ԍ�
	// add�F�Z��
	char name[20];
	int age;
	char tel[20];
	char add[50];
}addlist;
	

// �֐��̒�`�i�����j
// �����ɂēn���ꂽ�f�[�^���o�́B
// n:���̓f�[�^����

void output(addlist a[20],int n)
{
	int i;

	for(i=0;i<n;i++)
	{
		printf("%d,Name=%s,Age=%d,Tel=%s,Add=%s\n",i+1,a[i].name,a[i].age,a[i].tel,a[i].add);
	}

}

// �ȈՏZ���^�̃A�v��
int main(void)
{
	// �\���̂̐錾
	addlist a[20];

	// ���̓f�[�^�����̕ۑ��ꏊ
	int n=0;

	// �ꎞ�I�ȕۑ��ꏊ
	char tmpName[20];

	// �������[�v
	while(1)
	{
		scanf("%s",tmpName);
		if(strcmp(tmpName,":list")==0)
		{
			// ����:list�Ɠ��͂��ꂽ��A���͂��ꂽ���O�E�N��E�d�b�ԍ��E�Z���E����
			// ���֐��ɓn���B
			output (a,n);
		}
		else if(strcmp(tmpName,":exit")==0)
		{
			// ����:exit�Ɠ��͂��ꂽ��A�v���O�������I��������B
			return 0;
		}
		else if(n<20)
		{
			// �������̓f�[�^�������Q�O���ȉ��Ȃ�΁A���͂��ꂽ�f�[�^��ۑ��B
			// ���̓f�[�^�������{�P����B
			scanf("%d",&a[n].age);
			scanf("%s",a[n].tel);
			scanf("%s",a[n].add);
			
			strcpy(a[n].name,tmpName);
			
			n++;
		}
	}
}
