package com.abc.assignment1;
import java.util.Scanner;

public class Tower_of_hanoi {

	public int solveTowersOfHanoi(int n, String source, String aux, String dest)
			{
				// If only 1 disk, make the move and return.
				if(n==1)
				{
					System.out.println(source+" --> "+dest);
					return 1;
				}
				
				// Move top n-1 disks from A to B using C as auxiliary.
				solveTowersOfHanoi(n-1, source, dest, aux);
				
				//Move remaining disks from A to C
				System.out.println(source+" --> "+dest);
				
				// Move n-1 disks from B to C using A as auxiliary
				solveTowersOfHanoi(n-1, aux, source, dest);
			return 1;	
			}
			
			public static void main(String args[])
			{
				Tower_of_hanoi obj = new Tower_of_hanoi();
				
				System.out.println("Enter number of disks :- ");
			    
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				scanner.close();
				
				System.out.println("Move disks as below illustration.");
				obj.solveTowersOfHanoi(n, "A", "B", "C");
				
			}	
		}
		
		
	

