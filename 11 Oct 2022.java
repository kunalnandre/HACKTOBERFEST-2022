// Problem Statement : 11 Oct 2022

// Accept a string from user and print the total number of pallindrome word

// Input: "MOM AND DAD ARE MY BEST FRIENDS."
// Output : 2

// Input : str1 = "ABCBA ABCD DBBD BCDCB"
// Output : 3

// Input : str1 = ""
// Output : 0

// Input : str1 = "I like to play Cricket"
// Output : 1


// Solution:-

import java.util.Scanner;
class Main{
	
	static boolean checkPalin(String word)
	{
		int n = word.length();
		word = word.toLowerCase();
		for (int i=0; i<n; i++,n--)
		if (word.charAt(i) != word.charAt(n - 1))
			return false;	
		return true;
	}
	
	static int countPalin(String str)
	{	
	
		str = str + " ";
		
		String word = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if (ch != ' ')
				word = word + ch;
			else {
				if (checkPalin(word))
					count++;
				word = "";
			}
		}
		
		return count;
	}

	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    String firstword = sc.nextLine();
	    
		System.out.println(countPalin(firstword));
				
	}
}
