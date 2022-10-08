package com.demo;

import java.text.SimpleDateFormat;

public class DateFormate {

	public static void main(String[] args) {

			String pattern="MM-dd-yyyy";
			
			SimpleDateFormat dateformate = new SimpleDateFormat(pattern);
			dateformate.getDateFormatSymbols();
			System.out.println(dateformate);
		//	String date = SimpleDateFormat.format(new Date());
			
	}

}
