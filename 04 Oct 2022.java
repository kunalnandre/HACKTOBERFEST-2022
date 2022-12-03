// Problem Statement : 04 Oct 2022

// Accept TWO strings from user & Check if they are ANAGRAM or NOT

// Input : str1 = "abcde"      str2 = "cebad"
// Output : True

// Input : str1 = "test"      str2 = "ttee"
// Output : False

// Input : str1 = "hello"      str2 = "loleh"
// Output : True

// Input : str1 = "india"      str2 = "iinda"
// Output : True


// Solution:-
  
import java.util.*;
import java.util.Scanner;

public class Main {
	
	public static String sortString(String inputString)
	{
		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
	
	public static void main(String[] args)
	{   
	    Scanner sc= new Scanner(System.in);
	 
		String inputString1 = sc.nextLine();
		String inputString2 = sc.nextLine();
		
		String outputString1 = sortString(inputString1);
		String outputString2 = sortString(inputString2);
		
		if(outputString2.equals(outputString1)) 
				/* OR
		System.out.println(outputString1.equals(outputString2));
				*/
	{
            System.out.println("True");
        }else{
            System.out.println("False");
        }
	}
}

