package com.demo;



public class OperateProgram {

int a = 12 , b = 6 , c ;
	
	public void add()
	{
		c = a + b ;
		System.out.println("The addition value is " +c);
		
	}
	public void sub()
	{
		c = a - b ;
		System.out.println("The subtraction value is " +c);
		
	}
	public void mul()
	{
		c = a * b ;
		System.out.println("The multiplication value is " +c);
		
	}
	public void div()
	{
		c = a / b ;
		System.out.println("The division value is " +c);
		
	}
	public void mod()
	{
		c = a % b ;
		System.out.println("The modlo value is " +c);
		
	}


}
 class UnaryPrg	 	//unary operator
 {
	int d = 8 ,e ,f ;
	public void postIncre()
	{
		e = d++	;
		System.out.println("post increment value is " +e);
		f = d-- ;
		System.out.println("postdecreent value is :" +f);
			
	}
	public void preIncre()
	{
		e = ++d	;
		System.out.println("pre increment value is " +e);
		f = --d ;
		System.out.println("pre decreent value is :" +f);
			
		
	}
}
class RelPrg	//Relational operator
{
	byte x = 10 , y = 20   ;
	
	public void relatioalPrg()
	{
		if(x>y)
		{		
			System.out.println("The X value is large :" +x);
		}
		if(x<y)
		{
			System.out.println("The Y value is large :" +y);
			
		}
	}
}
 class OperPrgram
{
	public static void main(String[] args) {
		
		OperateProgram obj1 = new OperateProgram(); 
		
		UnaryPrg obj2 = new UnaryPrg();
		
		RelPrg obj3 = new RelPrg();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		obj1.mod();
		
		obj2.postIncre();
		obj2.preIncre();
		
		obj3.relatioalPrg();
		
	}
}

