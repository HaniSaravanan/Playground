#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int l;
  l=n%10;
  while(n>9)
  {
    n=n/10;
  }
  printf("%d",n+l);
	return 0;
}