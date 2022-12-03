// Problem Statement : 03 Oct 2022

// Accept a String from user & convert uppercase letter into lowercase letter and vice versa

//  Input : "tEsT"
// Output : "TeSt"

// Input : "mEt GdsC"
// Output : "MeT gDSc"

// Input : "CoDER"
// Output : "cOder"


// Solution:-

import java.util.Scanner;
public class Kunal_Nandre
{   
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();  

        StringBuffer nStr = new StringBuffer(str);    

        for(int i=0; i<=str.length()-1; i++) {    


             if(Character.isUpperCase(str.charAt(i))) {    

                nStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    

           else if(Character.isLowerCase(str.charAt(i))) {    

                nStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }    
        }    
        System.out.println(nStr);    
    }    
}     
