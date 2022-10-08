package com.demo;

public class Polindrom {

	public static void main(String[] args) {
				
		String str="malayalam";
		String Value="";
		
		for(int i = str.length()-1;i>=0;--i)
		{
			 Value = Value + str.charAt(i);	
		}
		if(str.equals(Value)) 
		{
			System.out.println("is polindrom number  " + str);
		}
		else
		{
			System.out.println("is not polindrom  number  " + str);			
		}
	}

}
