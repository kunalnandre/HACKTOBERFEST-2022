// Problem Statement : 08 Oct 2022
// Accept a string from user and Print all permutations of it

// Input : str1 = "ABC"
// Output : "ABC ACB BAC BCA CAB CBA"

// Input : str1 = "AB"
// Output : "AB BA"

// Input : str1 = ""
// Output : ""


// Solution:-

import java.util.*;
import java.util.Scanner;

Public class Main{

static void permute(String s , String answer)
{
	if (s.length() == 0)
	{
		System.out.print(answer + " ");
		return;
	}
	
	for(int i = 0 ;i < s.length(); i++)
	{
		char ch = s.charAt(i);
		String left_substr = s.substring(0, i);
		String right_substr = s.substring(i + 1);
		String rest = left_substr + right_substr;
		permute(rest, answer + ch);
	}
}

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s;
	String answer="";
	s = sc.nextLine();
	permute(s, answer);
}
}

