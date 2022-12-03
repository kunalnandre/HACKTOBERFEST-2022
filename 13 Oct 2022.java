// Problem Statement : 13 Oct 2022

// Accept array from user and rotate it from left by one place

// arr[] = {1, 2, 3, 4, 5, 6, 7,}
// Output:2 3 4 5 6 7 1 

// Input: arr[] = {3, 4, 5, 6, 7, 1, 2}
// Output: 4 5 6 7 1 2 3 


// Solution:-

import java.util.*;
public class Main {
    public static void main(String[] args) {

        //preparing my array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //now time to rotate it
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        

        //now we print the array
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
