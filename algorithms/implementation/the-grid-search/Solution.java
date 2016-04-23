import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 	Scanner scanner= new Scanner(System.in);
 	int t=Integer.parseInt(scanner.nextLine());
 	int x=0;
 	while(x<t)
 	{
 	String[] rc=scanner.nextLine().split(" ");
 	int r=Integer.parseInt(rc[0]);
 	//int c=Integer.parseInt(rc[1]);
    String[] grid=new String[r];
    for(int i=0;i<r;i++)
    {
    	grid[i]=scanner.nextLine();
    }
    String[] rc1=scanner.nextLine().split(" ");

    int r1=Integer.parseInt(rc1[0]);
    int c1=Integer.parseInt(rc1[1]);
    String[] p=new String[r1];
    for(int i=0;i<r1;i++)
    {
    	p[i]=scanner.nextLine();
    }
    int i=0;
    boolean found=false;
    for( i=0;i<(r-r1+1);i++)
    {

    	if(grid[i].contains(p[0]))
    	{
       	int j=0;
   		int k=grid[i].indexOf(p[0]);
   		
   		while(k >= 0) {
		
		for(j=0;j<r1;j++)
    	{
    		if(p[j].equals(grid[i+j].substring(k,k+c1))==false)
    		{
    			break;
    		}
    	}
    	if(j==r1)
    	{
    			System.out.println("YES");
    			found=true;
    			break;
    	}


     	k = grid[i].indexOf(p[0], k+1);
		}
		if(found)
		{
			break;
		}
		
		}

    }
    if(!found)
		{
				System.out.println("NO");
		}

  
 		x++;


 	}









    }
}