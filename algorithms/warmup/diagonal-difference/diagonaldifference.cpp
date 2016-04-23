//https://www.hackerrank.com/challenges/diagonal-difference
#include<iostream>
using namespace std;
int main()
{
int n;
cin>>n;
int a[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
cin>>a[i][j];
}
}
int left=0,right=0;
for(int i=0;i<n;i++)
{
left=left+a[i][i];
right=right+a[i][n-(i+1)];
}
if(left<0)
{
left=left*(-1);
}
if(right<0)
{
right=right*(-1);
}
if(left>right)
{
cout<<(left-right);
}
else
{
cout<<(right-left);
}
return 0;
}