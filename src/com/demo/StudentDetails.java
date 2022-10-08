package com.demo;

class StuDetail
{

	private int Student_RollNO;
	private int Student_Class;
	private char Student_section;
	private String Student_Name;
	private String Student_SclName;
	
	
	public int getStudent_RollNO()
	{
		return Student_RollNO;
	}
	public void setStudent_RollNO(int student_RollNO)
	{
		Student_RollNO = student_RollNO;
	}
	public int getStudent_Class()
	{
		return Student_Class;
	}
	public void setStudent_Class(int student_Class)
	{
		Student_Class = student_Class;
	}
	public char getStudent_section()
	{
		return Student_section;
	}
	public void setStudent_section(char student_section) 
	{
		Student_section = student_section;
	}
	public String getStudent_Name()
	{
		return Student_Name;
	}
	public void setStudent_Name(String student_Name)
	{
		Student_Name = student_Name;
	}
	public String getStudent_SclName()
	{
		return Student_SclName;
	}
	public void setStudent_SclName(String student_SclName)
	{
		Student_SclName = student_SclName;
	}

	
	
}
public class StudentDetails extends StuDetail {

	public static void main(String[] args) {
		

		StuDetail student = new StuDetail();
		
		student.setStudent_RollNO(10);
		System.out.println("My roll no is  :  "+student.getStudent_RollNO());
		
		student.setStudent_Class(10);
		System.out.println("My class  is   :  "+student.getStudent_Class());
		
		student.setStudent_section('R');
		System.out.println("My roll no is  :  "+student.getStudent_section());
		
		student.setStudent_Name("siva");
		System.out.println("My roll no is  :  "+student.getStudent_Name());
		
		student.setStudent_SclName("GHSS");
		System.out.println("My roll no is  :  "+student.getStudent_SclName());
		
	}

}
