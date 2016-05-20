#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int computeTN(int a,int b,int n)
    {
if(n==2)
    {
cout<<"returing "<<b<<" for n= "<<n<<"\n";
    return b;
}
if(n==1)
    {
cout<<"returing "<<a<<" for n= "<<n<<"\n";        
    return a;
}
if(n<=0)
    {
cout<<"returing 0 for n= "<<n<<"\n";
    return 0;
}else
    {
int c=  computeTN(a,b,n-2);
int d= computeTN(a,b,n-1);    
int z=(d*d)+c;
cout<<"returing "<<z<<" for n= "<<n<<"\n";
return z;        
}

}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a,b,n;
    cin>>a>>b>>n;
    cout<<computeTN(a,b,n);
    
    return 0;
}
