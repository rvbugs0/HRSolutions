#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        cin >> n;
        int x,p;	
//n is divisible by 3
       if(n%3==0)
       {
       	 p=0;
       	 x=1;
       	for(int i=1;i<=n;i++)
       	{
       		p=p+(5*x);
       		x=x*10;
       	}
       	cout<<p<<"\n";

       }
       else if(n%5==0)
       {
		p=0;
       	x=1;
       	for(int i=1;i<=n;i++)
       	{
       		p=p+(3*x);
       		x=x*10;
       	}
       	cout<<p<<"\n";
       }
       else{



       }






    }
    return 0;
}
