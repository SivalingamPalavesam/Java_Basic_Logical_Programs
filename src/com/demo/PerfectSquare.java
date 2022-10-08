package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=input.nextInt();

		List<Integer> arr = new ArrayList<Integer>(size); // 1, 4, 2, 5, 12, 5 , 2, 4

		System.out.println("Enter the array value :");

		for(int i =0; i<size;i++)
		{
			arr.add(input.nextInt());
		}
		int SubArray = size/2;
		System.out.println("Minimum sub array size is above 2  :"+SubArray);
		
		
	}

}
