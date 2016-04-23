#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
	int n,k;
	cin>>n>>k;
	int ch[n];
	for(int i=0;i<n;i++)
	{
		cin>>ch[i];
	}
	int pageNumber=1;
	int i=0;
	int count=0;
	while(i<n)
	{
		int rem=ch[i]%k;
		int numberOfPages;
		if(rem==0)
		{
			numberOfPages=ch[i]/k;
		}
		else
		{
			numberOfPages=1+((ch[i]-rem)/k);
		}
//		cout<<" numberOfPages for chapter "<<i+1<<" --> "<<numberOfPages<<"\n";
//		cout<<" chapter "<<i+1<<" starts at page number "<<pageNumber<<"\n";
		int x=pageNumber;
		int m = x+numberOfPages-1;
		int problemNumber=1;
		int totalRemainingProblems=ch[i];
		while(x<=m)
		{

			int low=problemNumber;
			int up;
			if(totalRemainingProblems>=k)
			{
			up=problemNumber+k-1;
			totalRemainingProblems=totalRemainingProblems-k;	
			}
			else
			{
			up=problemNumber+totalRemainingProblems-1;	
			totalRemainingProblems=0;	
			}

			if(x>=low && x<=up)
			{
//				cout<<"special question at page number "<<x<<"\n";
				count++;
			}
			problemNumber=up+1;
			x++;
		
		}
//		cout<<"breaking out of while loop\n";
		pageNumber=m+1;

		i++;
	}


	cout<<count;

    return 0;
}
