package com.abc.assignment1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number1,number2,gcd=1;
			System.out.println("enter two numbers ");
			Scanner sc = new Scanner(System.in);
			number1=sc.nextInt();
			number2=sc.nextInt();
			for(int i=1;i<=number1 && i<=number2 ;i++)
			{
				if(number1%i==0 && number2%i==0)
				{
					gcd=i;
				}
			}
			System.out.println(gcd);
	}

}
