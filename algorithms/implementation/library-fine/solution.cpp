#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int d1;
    int m1;
    int y1;
    cin >> d1 >> m1 >> y1;
    int d2;
    int m2;
    int y2;
    cin >> d2 >> m2 >> y2;
    if(y1-y2>0)
        {
        cout<<"10000";
    }
    else if(y1-y2<0)
    {
        cout<<"0";
    }
    else
        {
        if(m1-m2>0)
            {
            cout<<abs(m2-m1)*500;
        }
        else if(m1-m2<0)
        {
            cout<<"0";
        }
        else
            {
            if(d1-d2>0)
                {
                cout<<15*abs(d2-d1);
            }else
                {
                cout<<"0";
            }
        }
    }
        
    return 0;
}
