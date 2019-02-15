package com.abc.assignment1;

import java.util.Scanner;

public class GCD {

	
	static int gcd_or_not(int numb1,int numb2,int b)
	{
		for(int i=1;i<=numb1 && i<=numb2 ;i++)
		{
			if(numb1%i==0 && numb2%i==0)
			{
				b=i;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number1,number2,gcd=1;
			System.out.println("enter two numbers ");
			Scanner sc = new Scanner(System.in);
			number1=sc.nextInt();
			number2=sc.nextInt();
			int a=gcd_or_not(number1,number2,gcd);
			System.out.println(a);
	}

}
