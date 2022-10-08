package com.demo;

import java.util.Scanner;

public class SmallLetterOrNot {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String revStr="siva";
         
        for(int i=input.length()-1;i>=0;--i)
        {
        	revStr= revStr + input.charAt(i);
        }
        if(input.toLowerCase().equals(revStr.toLowerCase()))
        {
        	System.out.println("yes");
        }
        else
        {
        	System.out.println("NO");
        }
	}

}
