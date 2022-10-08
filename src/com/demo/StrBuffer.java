package com.demo;

import java.util.*;

public class StrBuffer {

	public static void main(String[] args) {
		
			//String buffer Function used
		
			StringBuffer buff = new StringBuffer("Java");
		
			buff.append(" is Object Oriented Programming language.");
			
			System.out.println(buff);
			
			System.out.println(buff.reverse());
			
			
			 //String Build function
			
			StringBuilder build = new StringBuilder("SQL is Database");
			
			System.out.println(build);
			
			System.out.println(build.delete(3, 6));
			
			build.append(" Store all Datas");
			
			System.out.println(build);
			
			//StringTokenizer Function
			
			/*StringTokenizer  StrToken =new StringTokenizer();
			
			double startTime =System.currentTimeMillis();
			
			System.out.println(System.currentTimeMillis()-startTime);*/
			
	}

}
