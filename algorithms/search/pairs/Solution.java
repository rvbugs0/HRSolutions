https://www.hackerrank.com/challenges/pairs
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class Solution {
    static int pairs(int[] a,int k) {
        Solution s= new Solution();
        s.mergesort(a,0,a.length-1);
        int count=0;
/*        for(int i=0;i<(a.length);i++)
        {
            System.out.print(a[i]+" ");
        }
*/

int p=0;
while(a[p]<k)
{
    p++;
}
for(int i=p;i<(a.length);i++)
{


    for(int j=i+1;j<(a.length);j++)
    {
        int diff=Math.abs(a[i]-a[j]);
        
        if(diff>k)
        {
            break;
        }
        if(diff==k)
        {
            count=count+1;
        }

    }
}
        return count;
    }


public  void merge(int[] a, int low, int high, int mid,int n)
{
    int i, j, k;
    int[] c=new int[n];
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


public void mergesort(int[] a, int low, int high)
{
    int mid;
    if (low < high)
    {
        mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,high,mid,a.length);
    }
    return;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        
        System.out.println(res);
    }
}
