import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[][] grid = new int[n][n];
        char[][] charGrid=new char[n][n];
        for(int i=0; i < n; i++){
            String numbers=in.nextLine();

            for(int j=0;j<n;j++)
            {
            	char c=numbers.charAt(j);
            	charGrid[i][j]=c;
            	grid[i][j]=Integer.parseInt(c+"");
            	
            }
        }
            for(int i=1;i<n-1;i++)
            {

            	for(int j=1;j<n-1;j++)
            	{
 					//TRBL

            		if(grid[i-1][j]<grid[i][j] && grid[i][j+1]<grid[i][j] && grid[i+1][j]<grid[i][j] && grid[i][j-1]<grid[i][j])
            		{
            			charGrid[i][j]='X';

            		}
            	}
            }
        for(int i=0; i < n; i++){

            for(int j=0;j<n;j++)
            {
            	System.out.print(charGrid[i][j]);
            	
            }
            System.out.println("");
        }

        
    }
}
