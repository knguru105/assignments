package com.abc.assignment1;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=10;
		System.out.println("Fibonacci Iterative approach");
		fibonacci(length);
		System.out.println("Fibonacci recursive approach");
		fibonacci_recursive(-1,1,length);
		
	}

	public static void fibonacci_recursive(int a,int b,int length) {
		// TODO Auto-generated method stub
		if(length==0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c+"");
		fibonacci_recursive(b,c,length-1);
		
	}

	public static int fibonacci(int length)
	{
	
			int a=-1;
			int b=1;
			int c=0;
			for(int i=0;i<length;i++)
			{
				c=a+b;
				System.out.println(c+"");
				a=b;
				b=c;
			}
			return 1;
	}

}
