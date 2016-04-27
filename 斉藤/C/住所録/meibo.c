#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct meibo{
	char name[20];
	int age;
	char tel[14];
	char adoress[256];
}meibo_t;

void str(meibo_t *syain){
	int i;
	int nam=1;
	for(i=0;i<20;i++){
		if(!strcmp(syain[i].name,":list")){
			break;
		}else{
			printf("%d %s %d %s %s\n",nam++,syain[i].name,
			syain[i].age,syain[i].tel,syain[i].adoress);
		}
	}
}

int main(void){

	int i=0;
	meibo_t syain[20];
	
	for(;;){
		scanf("%s",&syain[i].name);
		if(!strcmp(syain[i].name,":exit")){
			return 0;
		}else if(!strcmp(syain[i].name,":list")){
			str(syain);
			continue;
		}else{
			scanf("%d %s %s",&syain[i].age,&syain[i].tel,&syain[i].adoress);
			if(i>=20){
				printf("error!");
				continue;
			}
			i++;
		}
	}
}