package com.jdbc;

public class ObjectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj = 123;
		int eid_tmp = 0;
		eid_tmp = Integer.parseInt(String.valueOf(obj));
		System.out.println(eid_tmp+123);
	}

}
