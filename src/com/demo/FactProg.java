package com.demo;

import java.util.Scanner;

public class FactProg {

	public static void main(String[] args) {

		int i, Total_value = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("The user input is  :");

		int Number = input.nextInt();

		for (i = 1; i <= Number; i++) 
		{
			System.out.println(Total_value *= i);
		}
		System.out.println("the Fact value  is :  " + Total_value);
	}

}
