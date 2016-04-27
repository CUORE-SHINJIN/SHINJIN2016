#include <stdio.h>

int main(void)
{
	
	int n;
	int a = 0;
	
	scanf("%d", &n);
	
	while(n!=0)
	{
		n = n / 10;
		++a;
    }
    printf("%d\n", a);

    return 0;
}