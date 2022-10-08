package com.demo;

class ParaCons
{
	int RollNo;
	String Name;
	/*ParaCons(int RollNo ,String Name)
	{
		this.RollNo = RollNo;
		this.Name = Name;
		
	}*/
	public void setRollNo(int RollNo)
	{
		this.RollNo = RollNo;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
}

public class ParameterCons {

	public static void main(String[] args) {
		
		ParaCons obj = new ParaCons();
		obj.setRollNo(5);
		obj.setName("siva");
		
		System.out.println(obj.getRollNo());
		
		System.out.println(obj.getName());
		
	}

}
