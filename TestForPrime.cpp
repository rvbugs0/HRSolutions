#include<iostream>
#include<math.h>
using namespace std;

int main()
{
	int n;
	cin>>n;
	int flag=0;
	int z=sqrt(n);
	for(int i=2;i<=z;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;

		}
	}
	if(flag)
	{
		cout<<"Not Prime \n";
	}else
	{
		cout<<"Prime \n";
	}
	return 0;
}