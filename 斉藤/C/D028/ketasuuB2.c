#include<stdio.h>
#include<string.h>
int main(void)
{
	char len,s;
	int i;
	scanf("%s",&s);
		if(s<=10000){
			len=strlen(&s);
			if(len>=1&&len<=5){
				printf("%d\n",len);
			}else{
				printf("error!");
			}
		}else{
			printf("error!");
		}
	return 0;
}
/*�ۑ�F�������v�Z�ɂȂ��Ă���̂�-1�ȉ��̏ꍇ�ŃG���[���o�Ȃ�*/