// Problem Statement : 05 Oct 2022
// Accept a string from user and return MAX length of a word from string

// Input : str1 = "I love my India"
// Output : 5

// Input : str1 = "Coding is best"
// Output : 6

// Input : str1 = ""
// Output : 0

// Input : str1 = "I like to play Cricket"
// Output : 7

// Solution:-

import java.util.*;
import java.util.Scanner;

Public class Main{
	static int LongestWordLength(String str)
	{
	int n = str.length();
	int res = 0, curr_len = 0;
	for (int i = 0; i < n; i++)
	{
		if (str.charAt(i) != ' ')
			curr_len++;

		else
		{
			res = Math.max(res, curr_len);
			curr_len = 0;
		}
	}

	return Math.max(res, curr_len);
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.println(LongestWordLength(str1));
	}
}
