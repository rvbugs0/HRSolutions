//https://www.hackerrank.com/challenges/a-very-big-sum
#include<iostream>
using namespace std;
int main()
{
int n;
cin>>n;
int a[n];
long long sum=0;
for(int i=0;i<n;i++)
{
cin>>a[n];
sum=sum+a[n];
}
cout<<sum;
return 0;
}