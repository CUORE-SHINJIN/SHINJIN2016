#include<stdio.h>
#include<string.h>

int main()
{
	int n,i=0;
	char str1[256],str2[256];

	scanf("%s%d",&str1,&n);				/*“ü—Í•”•ª*/
	
	if(strlen(str1)<=100 && strlen(str1)>=1 && n>=1 && n<=strlen(str1))
	{
		while(str1[i] != '\0')
		{
			if(str1[i]<=122 && str1[i]>=65)
			{
				strncpy(str2,str1,n);
				str2[n] = '\0';
				i++;
			}
			else
			{
				strcpy(str2,"error");
				break;
			}
			
		}
		printf("%s\n",str2);
	}
	else
	{
		printf("error\n");
	}
}
