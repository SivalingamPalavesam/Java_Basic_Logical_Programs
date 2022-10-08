package com.demo;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The user input is  :");
		
		int Number =input.nextInt();
		
		if(Number % 2 == 0)
		{
			System.out.println("This is Even number" +Number);
		}
		else 
		{
			System.out.println("This is odd  number" +Number);
		}
	}

}
