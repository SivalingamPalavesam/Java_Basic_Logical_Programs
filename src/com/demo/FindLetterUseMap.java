package com.demo;

import java.util.HashMap;
import java.util.Map;

public class FindLetterUseMap 
{
	public static void main(String[] args) {
		
		String str ="aabbdsdvcbgggc";
		
		char[] ch= str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i <ch.length;i++)
		{
			if(map.containsKey(ch[i]))
			{
				int count = map.get(ch[i]);
				map.put(ch[i], count +1);
			}
			else
			{
				map.put(ch[i],1);
			}
		}
		System.out.println(map);
	}
}
