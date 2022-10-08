package com.demo;

import java.util.ArrayList;
import java.util.List;

public class TestProgram {

	public static void main(String[] args) {

		String str = "aaabcdc";

		char[] ch= str.toCharArray();

		List list =  new ArrayList<>();
		List notEq =  new ArrayList<>();
		for(int i = 0 ; i<ch.length;i++)
		{
			for(int j =1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					list.add(i, ch[j]);
					System.out.println("if"+ch[j]);
						
				}
				else if(ch[i] != ch[j])
				{
					notEq.add(i, ch[j]);
					System.out.println("else if "+ch[j]);
					
				}
				else
				{
					String Str = str + ch[j];
					System.out.println(str);
				}

			}
		}System.out.println("This is deffrence letter "+notEq);
		System.out.println("This is same letter"+list);
		
	}	

}
