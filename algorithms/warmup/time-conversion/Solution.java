import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] strings=time.split(":");
        int hours=Integer.parseInt(strings[0]);
        int minutes=Integer.parseInt(strings[1]);
        String aa=strings[2];
        int seconds=Integer.parseInt(aa.substring(0,aa.length()-2));
        String dayTime=aa.substring(aa.length()-2);
        
        if(dayTime.equals("PM"))
            {
            if(hours!=12)
            {
                hours=hours+12;
            }
        }
        if(dayTime.equals("AM"))
            {
            if(hours==12)
                {
                hours=0;
            }
        }
        
        
        
        System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
            
        
    }
}
