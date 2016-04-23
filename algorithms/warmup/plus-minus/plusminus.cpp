//https://www.hackerrank.com/challenges/plus-minus
#include<iostream>
#include<stdio.h>
using namespace std;
int  main()
{
int n;
cin>>n;
float f1=0,f2=0,f3=0;
int a[n];
for(int i=0;i<n;i++)
{
cin>>a[n];
if(a[n]<0)
{
f1++;
}
else if(a[n]>0)
{
f2++;
}
else
{
f3++;
}
}
f1=f1/n;
f2=f2/n;
f3=f3/n;
printf("%.3f\n",f2);
printf("%.3f\n",f1);
printf("%.3f\n",f3);

return 0;
}