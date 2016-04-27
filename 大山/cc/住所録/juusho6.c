#include<stdio.h>
#include<string.h>

typedef struct _meibo
{
	char na[20];
	int a;
	char t[16];
	char add[130];
}meibo;


int out(meibo *p,int n)
{
	int i;
	
	
	for(i=0;i<n;i++)
	{
		printf("%d %s %d %s %s\n",i+1,p[i].na,p[i].a,p[i].t,p[i].add);
	}
}


int main()
{
	int i=0,n=0;
	meibo p[30];
	char str[200];
	char *last;
	
	do
	{
		fgets(str,200,stdin);
		last=strpbrk(str,"\n");
		*last='\0';
		if(strcmp(str,":list")==0)
		{
			out(p,n);
		}
		else if(strcmp(str,":exit")!=0)
		{
			sscanf(str,"%s%d%s%s",p[i].na,&p[i].a,p[i].t,p[i].add);
			if(i>=20)
			{
				printf("error_20over\n");
				continue;
			}
			i++;
			n++;
		}
	}while(strcmp(str,":exit")!=0);
}
	
