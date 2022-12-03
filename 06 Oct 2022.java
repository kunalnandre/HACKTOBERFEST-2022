// Problem Statement : 06 Oct 2022

// Accept a string from user and reverse words from it

// Input : str1 = "I love my India"
// Output : "I evol ym aidnI"

// Input : str1 = "Coding is best"
// Output : "gnidoC si tseb"

// Input : str1 = ""
// Output : ""

// Input : str1 = "I like to play Cricket"
// Output : "I ekil ot yalp tekcirC"

// Solution:-


import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      
        String[] words = str.split(" ");
        String reverseString = "";
        
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
               
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
        sc.close();
    }
}
