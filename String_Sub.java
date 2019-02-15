package com.abc.assignment6;
import java.util.*;
class String_Sub
{

	/*program to find Substring in a string
   */ public static void main(String a[]) {
    	System.out.print("program to find substring in a String\n");
Scanner sc= new Scanner(System.in);
        String str=null;
        String substr=null;
        System.out.print("Enter string1: \n");
		str=sc.nextLine();

		System.out.print("Enter substring: \n");
        substr=sc.nextLine();


       int j= subStringIndex(str,substr);
       //j++;
       System.out.print("sub string found at "+j+" location");

    }


    public static int subStringIndex(String str, String substr) {
        int substrlen = substr.length();
        int strlen = str.length();
        int j = 0;

        if (substrlen >= 1) {
            for (int i = 0; i < strlen; i++) {              // iterate through main string
                if (str.charAt(i) == substr.charAt(j)) {    // check substring
                    j++;                                    // iterate
                    if (j == substrlen) {                   // when to stop
                        return i - substrlen; //found substring. As i is currently at the end of our substr so sub substrlen
                    }
                }
                else {
                    j = 0;
                }
            }
        }
        System.out.println("given String not found");
        
        return -1;
}
}