import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
        Scanner sc=new Scanner(System.in);
        int T= Integer.parseInt(sc.nextLine());         
        int x=0;
        while(x<T)
        {
            String s=sc.nextLine();
            int l=s.length()-1;
            int found =0;
            for(int i=0;i<l;i++)
            {

                if(s.charAt(i)!=s.charAt(l-i))
                {

                //case 1 remove last char    
                if(s.charAt(i)==s.charAt(l-i-1) && s.charAt(i+1)==s.charAt(l-i-2))
                {
                    System.out.println(l-i);
                    found=1;
                    break;
                }
                else
                {
                 System.out.println(i);
                    found=1;
                    break;   
                }


     

                }

            }
            if(found==0)
            {
                System.out.println(-1);
            }
            x++;
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
