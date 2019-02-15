package com.abc.assignment2;
import java.io.*;
import java.util.*;
import java.util.Scanner;


class reverse1
{

    public static void main(String a[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a String");
    String b=sc.nextLine();
    String c=reverse(b);
    System.out.println(c);
    //System.out.println(a);


}


public static String reverse(String str)
{
    char[] chararr= str.toCharArray();
    int size=chararr.length;
    Stack<Character> stack= new Stack<Character>();
    int i;
    for(i=0;i<size;i++)
    {
        stack.push(chararr[i]);
    }
    for(i=0;i<size;i++)
    {
        chararr[i]=(char) stack.pop();

    }
    return String.valueOf(chararr);
 }
}
