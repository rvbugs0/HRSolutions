#include <iostream>
using namespace std;

int height(int n) {
int ht=1;
for(int j=1;j<=n;j++)
{
if(j%2!=0)
{
ht= ht*2;
}
else
{
ht++;
}
}
return ht;
}




int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
