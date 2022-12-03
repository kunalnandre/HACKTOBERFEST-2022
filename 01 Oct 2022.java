// Problem Statement : 01 Oct 2022:

// Accept a String from user & check if Palindrome or NOT-
// Input : "ABC"
// Output : NOT Palindrome

// Input : "ABBCCBBA"
// Output : Palindrome

// Input : "RACECAR"
// Output : Palindrome

// Inout : "step on no pets"
// Output : Palindrome


// Solution:-

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n= sc.nextLine();
	String rev="";
	for(int i=n.length()-1;i>=0;i--){
	    rev=rev + n.charAt(i);}
	
	if(rev.equals(n)){
	    System.out.println("Palindrome");}
	else{
	    System.out.println("Not palindrome");}
	}
}
