package com.demo;

public class WhitespaceProgram {

	public static void main(String[] args) {
		 String str = "     Java    Progaraming   Language      ";
	       
		 str = str.replaceAll("\\s", "");
	       
	        System.out.println(str);
		
	
	}	
		
}
