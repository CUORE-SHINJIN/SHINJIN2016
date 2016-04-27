#include<stdio.h>
#include <string.h>
int cheak(int y,int m,int d){
	if(y>=2000&&y<=2014&&y%4==0){
		switch(m){
			case 2:
				if(d>=1&&d<=29){
					return 1;
				}else{
					return 2;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				if(d>=1&&d<=30){
					return 1;
				}else{
					return 2;
				}
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(d>=1&&d<=31){
					return 1;
				}else{
					return 2;
				}
			}
	}else{
		if(m==2){
			if(d>=1&&d<=28){
				return 1;
			}else{
				return 2;
			}
		}else if(m==4||m==6||m==9||m==11){
			if(d>=1&&d<=30){
				return 1;
			}else{
				return 2;
			}
		}else if(m<=12){
			if(d>=1&&d<=30){
				return 1;
			}else{
				return 2;
			}
		}
	}
}
int main(void)
{
	int y,m,d;
	scanf("%d %d %d",&y,&m,&d);
	if(cheak(y,m,d)==1){
		printf("%d/%d/%d\n",y,m,d);
	}else{
		printf("error!\n");
	}
	return 0;
}