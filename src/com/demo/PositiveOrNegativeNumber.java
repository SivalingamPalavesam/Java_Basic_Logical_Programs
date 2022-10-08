package com.demo;

import java.util.Arrays;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -2, -3, -4, 5, -6 };
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] >= 0) {
				System.out.println("This is positive Number : "+ arr[i]);
			}
			else
			{
				System.out.println("This is negative Number :"+ arr[i]);
			}
		}
	}
}