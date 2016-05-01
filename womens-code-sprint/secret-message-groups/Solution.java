import java.io.*;
import java.util.*;

public class Solution {
	public static String  sortProduce(String str)
	{

		char[] chars=str.toCharArray();
// sort the array
Arrays.sort(chars, new Comparator<Character>() {
    public int compare(Character c1, Character c2) {
        int cmp = Character.compare(
            Character.toLowerCase(c1.charValue()),
            Character.toLowerCase(c2.charValue())
        );
        if (cmp != 0) return cmp;
        return Character.compare(c1.charValue(), c2.charValue());
    }
});

// rebuild the string
StringBuilder sb = new StringBuilder(chars.length);
for (char c : chars) sb.append(c);
str = sb.toString();
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 		Scanner sc=new Scanner(System.in);
 		int t= Integer.parseInt(sc.nextLine());
 		ArrayList<String> strings = new ArrayList<String>();
 		int lowestLength=2001;
 		while(t--!=0)
 		{
 		String m=sc.nextLine();	
 		strings.add(m);	
 		int l=m.length();
 		if(l<lowestLength)
 		{
 			lowestLength=l;
 		}
 		}
 		




    }
}