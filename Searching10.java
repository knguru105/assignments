package com.abc.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Searching10 {
	
	public static void main(String args[])
	{
		
		int number,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n= sc.nextInt();
		 int a[]= new int[n];
		System.out.println("enter numbers");
		for(int j=0;j<n;j++)
		{
			 a[j]=sc.nextInt();
		}
		System.out.println("enter number to search");
		number=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			if(a[i]==number)
			{
				System.out.println("number found ");
			}
			
		}
		
		System.out.println("not found");
		
	}

}
