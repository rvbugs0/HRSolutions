import java.io.*;
// Java program to print all possible strings of length k
class PrintAllKLengthStrings
{

	public static void main(String[] args) {
	
	MyThread mt=new MyThread();
	Thread t=new Thread(mt);
	t.start();
}

}


class  MyThread implements Runnable {

	public void run()
	{
		
			int k = 3;
		try
		{
			pw=new PrintWriter("wordlist.txt");
			System.out.println("First Test");
			char set1[] = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
			printAllKLength(set1, 10);
			/*
			,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			printAllKLength(set1, 9);
			printAllKLength(set1, 10);
			printAllKLength(set1, 11);
			printAllKLength(set1, 12);
			*/
			pw.close();
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}		 
	}

	public static PrintWriter pw =null;
	// Driver method to test below methods
 

	// The method that prints all possible strings of length k. It is
	// mainly a wrapper over recursive function printAllKLengthRec()
	static void printAllKLength(char set[], int k) {
		int n = set.length;	 
		printAllKLengthRec(set, "", n, k);
	}

	// The main recursive method to print all possible strings of length k
	static void printAllKLengthRec(char set[], String prefix, int n, int k) {
		
		// Base case: k is 0, print prefix
		if (k == 0) {
				//System.out.println(prefix);
			try
			{
				pw.write(prefix+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return;
		}

		// One by one add all characters from set and recursively 
		// call for k equals to k-1
		for (int i = 0; i < n; ++i) {
			
			// Next character of input added
			String newPrefix = prefix + set[i]; 
			
			// k is decreased, because we have added a new character
			printAllKLengthRec(set, newPrefix, n, k - 1); 
		}
	}
}
