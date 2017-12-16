package com.rtm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
		
		Connection  conn = DriverManager.getConnection(url, "root", "root");
		System.out.println(conn);
	}

}
