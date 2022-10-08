package com.demo;

import java.util.Scanner;

public class FibnacciProg {

	public static void main(String[] args) {

		int fisNum = 0 ,secNum = 1 , total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fib Count Number  :");
		
		int count = input.nextInt();
			
		System.out.println(""+fisNum+" + "+secNum);
		
		for(int i = 2 ;i <= count; ++i)
		{
			total = fisNum  + secNum;
			
			System.out.println(" fib Number  is :"+total);
			
			fisNum = secNum;
			
			secNum = total;			
		}
		input.close();
	}

}
