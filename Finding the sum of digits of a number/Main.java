#include <stdio.h>
int main() {
	//Type your code
  int num,n,sum=0;
  scanf("%d",&num);
  while(num>0)
  {
    n=num%10;
    sum+=n;
    num/=10;
  }
  printf("%d",sum);
	return 0;
}