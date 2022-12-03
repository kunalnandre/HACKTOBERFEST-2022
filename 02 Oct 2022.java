// Problem Statement : 02 Oct 2022:

// Accept a String from user & Calculate Capital Letters from it-
// Input : "ABC"
// Output : 3

// Input : "AbCdE"
// Output : 3

// Input : "CoDing MET"
// Output : 5

Solution:-
  
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		     int upper = 0;
		
		for(int i = 0; i < str.length(); i++){
		
		 char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
		}
		
		System.out.println(upper);
	}
}
