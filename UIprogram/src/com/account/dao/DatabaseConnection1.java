package com.account.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection1{
	public static Connection getConnection()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","oracle");
	return DriverManager.getConnection("jdbc:oracle:thin:@103.62.238.195:1521:rbsdb","scott","rbs");
	}
}

