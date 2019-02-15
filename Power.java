package com.abc.assignment1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,n;
		long result;
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("Enter it's power");
		n=sc.nextInt();
		result=power(x,n);
		System.out.println(result);
		
	}
	static long power(int x,int n)
	{
		if(n!=0)
		{
			return(x*power(x,n-1));
		}
		else
		return 1;
	}

}
