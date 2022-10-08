package com.demo;

import java.util.Scanner;

public class ArmstProg {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("The user input is  :");

		int userValue = input.nextInt();

		int r = 0, sum = 0;

		int temp = userValue;

		while (userValue > 0) 
		{
			r = userValue % 10;

			sum = sum + (r * r * r);

			userValue = userValue / 10;
		}
		if (temp == sum) {
			System.out.println("This is armstrong");
		} else {
			System.out.println("This is not arms");
		}
		input.close();
	}
}
