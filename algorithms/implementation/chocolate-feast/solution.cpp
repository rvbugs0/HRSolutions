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
        int c;
        int m;
        cin >> n >> c >> m;

      	int numChoc=(n/c);

        int numWrap=numChoc;
        while((numWrap)>=m)
        {
        	numWrap=numWrap-m;
        	numChoc++;
        	numWrap++;
        }
        cout<<numChoc<<"\n";

    }
    return 0;
}
