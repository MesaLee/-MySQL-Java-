package com.jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String temp_str="";   
	    Date dt = new Date();    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
	    temp_str=sdf.format(dt);   
	    System.out.println(temp_str);
	}

}
