#include<iostream>
using namespace std;
int main()
{
	int n,m;
	cin>>n;
	cin>>m;
	int i,j,k;
	for(i=1;i<=(n-m+1);i++)
	{
		for( j=i+1;j<n;j++)
		{
			k=j+1;

			while(k<=n)
			{
				cout<<i<<"\t"<<j<<"\t"<<k<<"\n";
				k++;
			}
		}

	}
	return 0;
}