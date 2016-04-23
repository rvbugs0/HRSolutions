#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
	int n;
	cin>>n;
	while(n--)
	{
		int a,b;
		cin>>a>>b;
		int a1=sqrt(a);
		int b1=sqrt(b);
		if((a1*a1)<a) a1++;
//		cout<<"a1 "<<a1<<" b1 "<<b1<<"\n";
		cout<<b1-a1+1<<"\n";
	}
    return 0;
}
