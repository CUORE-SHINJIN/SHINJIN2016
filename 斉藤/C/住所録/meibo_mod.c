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
	char insuu[256];
	char* last;
	
	for(;;){
		//fgets(insuu,10,stdin);
		fgets(insuu,256,stdin);
		
		//sscanf(insuu,"%s",syain[i].name);
		//if(!strcmp(syain[i].name,":exit")){
		// æ“ª‚ª':'(ƒRƒ}ƒ“ƒh)‚Å‚ ‚ê‚Î
		if (insuu[0] == ':') {
			last = strpbrk(insuu, "\r\n");
			*last = '\0';
			if(!strcmp(insuu,":exit")){
				return 0;
			//}else if(!strcmp(syain[i].name,":list")){
			}else if(!strcmp(insuu,":list")){
				str(syain);
				continue;
			}
		} else{
			//fgets(insuu,256,stdin);
			sscanf(insuu,"%s %d %s %s",
				syain[i].name, &syain[i].age,syain[i].tel,syain[i].adoress);
			if(i>=20){
				printf("error!");
				continue;
			}
			i++;
		}
	}
}