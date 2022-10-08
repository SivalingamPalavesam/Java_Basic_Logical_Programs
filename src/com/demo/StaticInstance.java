package com.demo;

class StaticBlock
{
	static
	{
		System.out.println("This is a static block");//This block is class loading time call
	}
	{
		System.out.println("This is instance block"); //istance is object creation time call
	}

}
 class MethodCheck extends StaticBlock
{
	public void methedCheck()
	{
		System.out.println("This is method block");
	}
}


public class StaticInstance {
	
	public static void main(String[] args) {
		
		MethodCheck obj =new MethodCheck();
		obj.methedCheck();
		
	}

}
