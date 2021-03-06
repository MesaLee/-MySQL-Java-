package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utils {
	static Connection conn=null;
	static Statement st=null;
	
	static{
		try {
			//1、加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2、创建连接
			/*
			 * 所要连接数据库的地址
			 * jdbc:mysql://主机名:端口号/数据库名?
			 * user=***&password=***
			 * &useUnicode=true&characterEncoding=UTF8
			 */
			String url="jdbc:mysql://127.0.0.1:3306/db";
			String user="root";
			String password="123";
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		return conn;
	}
	
	public static Statement getSt(){
		try {
			st=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
	
	public static void close(Statement st){
		try {
			//6、回收资源
			if(st!=null){
				st.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
