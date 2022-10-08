package com.demo;

class ConstProgram
{
	int id; String name;
	
	ConstProgram()
	{
		System.out.println("int Default vailue is :"+id+"\nString Default value is :   "+name);
	}
	public void sampleMethod()
	{
		System.out.println("java");
	}
}


public class DefaultCons {

	public static void main(String[] args) {
		
		ConstProgram obj = new  ConstProgram();
		obj.sampleMethod();

	}

}
