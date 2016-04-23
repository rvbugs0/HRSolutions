#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
    char arr[n];
    cin >> arr;
    int k;
    cin >> k;
    for(int i=0;i<n;i++)
    {
    	if((arr[i]>=65 && arr[i]<=90))
    	{
    		int x=arr[i];
    		k=k%26;
    		arr[i]=x+k;
    		if(x+k>90)
    		{
    		arr[i]=(x+k)-90+64;
    		}
    			
    		
    	}
    	if((arr[i]>=97 && arr[i]<=122))
    	{
    		
    		int x=arr[i];
    		k=k%26;
    		arr[i]=x+k;
    		if(x+k>122)
    		{
    		arr[i]=(x+k)-122+96;
    		}

    	}

    }
    cout<<arr;


    return 0;
}
