import java.util.*;
class Permutations
{
	public static ArrayList<String> strings=new ArrayList<String>();


	public static void permutation(String str)
	{
		permutation("",str);
	}

	private static void permutation(String prefix,String str)
	{
		int n=str.length();
		if(n==0) System.out.println(prefix);
		else
		{
			for(int i=0;i<n;i++)
			{
				permutation(prefix+ str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
			}
		}

	}

	public static void main(String gg[])
	{
	
	Permutations pe=new Permutations();
	pe.permutation("123");
	/*
	int x=0;
	int s=pe.strings.size();
	while(x<s)
	{
		System.out.println(pe.strings.get(x));
		x++;
	}
	*/
	}
}