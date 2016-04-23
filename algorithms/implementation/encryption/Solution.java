import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
     	int l=s.length();
     	double d=Math.sqrt(l);
     	int d1=(int)Math.sqrt(l);
     	int lower=0,upper=0;
     	if(d-d1==0)
     	{
     		lower=upper=d1;
     	
     	}
     	if(d-d1>0)
     	{
     		lower=d1;
     		upper=lower+1;
     	}
     	if(lower*upper<l)
     	{
     		lower++;
     	}
     	char[][] arr=new char[lower][upper];
     	int x=0,y=0;
     	int count=0;
     	while(x<lower)
     	{
     		y=0;
     		while(y<upper)
     		{


     			if(count>=l)
     			{
     			arr[x][y]='|';	
     			}
     			else
     			{
     			arr[x][y]=s.charAt(count);
     			}
     			count++;
     			y++;
     		}
     		x++;
     	}
     	x=0;
     	while(x<upper)
     	{
     		y=0;
     		while(y<lower)
     		{
     			if(arr[y][x]!='|')
     			{
     				System.out.print(arr[y][x]);
     			}
     			y++;
     		}
     		System.out.print(" ");
     		x++;
     	} 

    }
}