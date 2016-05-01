import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t--!=0)
            {
            String s=sc.nextLine();
            String s1=new StringBuffer(s).reverse().toString().replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
            int x=0;
            int l=s.length();
            String newString="";
            int count=0;
            int l1=s1.length();
            while(x<l)
                {
                    char c=s.charAt(x);
                if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
                    {
                 newString=newString +c;                                                
                }else
                    {
                        if(count<l1)
                        newString=newString+s1.charAt(count);
                        
                        count++;
                }
                
                x++;
            }
            System.out.println(newString);
            
                 }
    }
}