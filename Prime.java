package com.abc.assignment1;

import java.util.Scanner;

public class Prime {

	public static int primeOrNot()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=(sc.nextInt());
		int i=2;
		boolean flag= false;
		while(i<=number/2)
		{
			if(number%2==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		return 1;

	}
	public static void main(String[] args){
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		primeOrNot();
	}

}
