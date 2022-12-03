// Problem Statement : 09 Oct 2022

// Accept a string from user and Print all Cobinations of it

// Input : str1 = "ABC"
// Output : "ABC AB AC A BC B C   "

// Input : str1 = "AB"
// Output : "AB A B  "

// Input : str1 = "A"
// Output : "A  "


// Solution:-

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int temp = 0;
        String arr[] = new String[len*(len+1)/2];
        for(int i=0; i<len; i++)
        {
            for(int j=i; j<len; j++)
            {
                arr[temp] = str.substring(i,j+1);
                temp++;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
