package com.abc.assignment6;import java.io.*;
import java.util.*;

class String_operations
{
 public static void main(String args[])
 {
    	int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to check whether it contains character C or not \n");
        String input=sc.nextLine();
        for(int i =0 ; i<input.length(); i++
        ){
            if(input.charAt(i) == 'c'){
            	flag=1;
                System.out.println("character C found at "+(++i)+"th position");
            }

        }
        if(flag==0)
        {
        	System.out.println("character C not found");
            
        }
        
        
        //strings equal or not
        
System.out.print("enter strings to check whether they are equal or not \n");
        
        String str1=null;
        String str2=null;
        System.out.print("Enter string1: ");
		str1=sc.nextLine();
		System.out.print("Enter string2: ");
        str2=sc.nextLine();
        if(str1.length()!=str2.length())
        {
			//System.out.println("Strings are not same, lengths are different!!!");
			//return;
		}
        boolean flg=true;
		for(int i=0; i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i)){
				flg=false;
				break;
			}
		}

		if(flg){
			System.out.println("Strings are same.");
		}
		else{
			System.out.println("Strings are not same.");
		}
		
		
		
		
		//count function
		
		

		String str3;
		System.out.print("Enter a string to check it's length: ");
		str3=sc.nextLine();
		
		int c=count(str3);
 
		
		
		
 }//main
 
 
 static int count(String blah)
 {

int count = 0;
for (char c : blah.toCharArray()) {
 count++;
}
System.out.println("String's length is: " + count);
return 1;
 }
 
 
 
 
 
 
 
}//class
