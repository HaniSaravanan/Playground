#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int f,l;
  l=n%10;
  f=n/100;
  printf("%d",f+l);
  return 0;
}