#include<stdio.h>
#include<string.h>

int main()
{
	int i;
	char str[256];
	char *last;
	char mozi[256];
	char a[10];
		
	fgets(str,256,stdin);			//�z��T�C�Y256�܂ł̓��͂�str�֊i�[
	
	last=strpbrk(str,"\n");			//str�̔z��̍Ō�̉��s�̈ʒu(�A�h���X)
	
	*last='\0';						//��L�œ����A�h���X��'\0'���i�[
									//������Ƃ��邽�߂ɏI�[��������������	
									
	if(strcmp(str,":list")==0)		//������Ƃ����̂Ŕ�r�ł���
	{
		sscanf(str,"%s",a);
									//str����ϊ��w��ɏ]���Ĉ����Ɋi�[
	}
	
	printf("%s\n",str);				//str����ϊ��w��ɏ]���ďo��
	
	printf("%s\n",a);	//����������ɏ]���ĕW���o�͂ɏo��
}