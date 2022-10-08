package com.demo;

public class TestProg {
	
	  
	   
	static int a = 10;  
	static int n;   
	int b = 5;  
	int c; 
	
	TestProg(int m) 
	{        
		System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);  
	} 
	 static
	 {
		 a = 60;
	 }  
	 
	 {        b = 30;        n = 20;    } 

	public static void main(String[] args) {
		  
		TestProg obj = new TestProg(0);
		
	}

}
