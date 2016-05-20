#include <iostream>
#include <math.h>
using namespace std;

int main()
{
  int n1, n2, i, j, flag;
  cout<<"Enter two numbers(intevals): \n";
  cin>>n1>>n2;
  cout<<"Prime numbers between "<<n1<<" and "<<n2<<" are: \n";
  for(i=n1+1; i<n2; ++i)
  {
      flag=0;
      int z= sqrt(i);
      for(j=2; j<=z; ++j)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        cout<<i<<"\t";
  }
  return 0;
}