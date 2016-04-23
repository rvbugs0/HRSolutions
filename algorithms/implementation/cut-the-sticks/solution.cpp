#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void merge(int *,int, int , int ,int);
void mergesort(int *a, int low, int high,int n)
{
    int mid;
    if (low < high)
    {
        mid=(low+high)/2;
        mergesort(a,low,mid,n);
        mergesort(a,mid+1,high,n);
        merge(a,low,high,mid,n);
    }
    return;
}
void merge(int *a, int low, int high, int mid,int n)
{
    int i, j, k, c[n];
    i = low;
    k = low;
    j = mid + 1;
    while (i <= mid && j <= high)
    {
        if (a[i] < a[j])
        {
            c[k] = a[i];
            k++;
            i++;
        }
        else
        {
            c[k] = a[j];
            k++;
            j++;
        }
    }
    while (i <= mid)
    {
        c[k] = a[i];
        k++;
        i++;
    }
    while (j <= high)
    {
        c[k] = a[j];
        k++;
        j++;
    }
    for (i = low; i < k; i++)
    {
        a[i] = c[i];
    }
}

void printArray(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<"\t";
    }
    cout<<"\n";
}

void cutSticks(int a[],int low,int high)
{
if(low>high) return ;
if(a[low]==0) return;
int p=0;
int j=0;
int i=low;
int found=0;
int temp=a[low];
while(i<=high)
{

    a[i]=a[i]-temp;
    if(a[i]!=0 && found==0) 
        {
            found=1;
            j=i;
            }        
    p++;
    i++;
}
cout<<p<<"\n";
cutSticks(a,j,high);
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    
    }
    mergesort(arr,0,n-1,n);
    cutSticks(arr,0,n-1);
    return 0;
}

