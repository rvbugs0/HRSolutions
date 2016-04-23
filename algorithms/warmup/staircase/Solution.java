import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String getSpaces(int n)
        {
        String sp="";
        for(int i=0;i<n;i++)
            {
            sp=sp+" ";
        }
        return sp;
    }
    public static String getHashes(int n)
        {
        String sp="";
        for(int i=0;i<n;i++)
            {
            sp=sp+"#";
        }
        return sp;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0;i<n;i++)
            {
            System.out.print(getSpaces(n-i-1));
            System.out.println(getHashes(i+1));
            
            
        }
    }
}