#include <stdio.h>

int main(void)
{
	
	int a, b, c;
	
	scanf("%d", &a);
	
	scanf("%d", &b);
	
	if (a < b) {
		c=b-a;
	} else if ( b < a) {
		c=a-b;
	}

	printf("%d\n", c);
}