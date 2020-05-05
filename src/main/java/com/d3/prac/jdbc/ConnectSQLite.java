package com.d3.prac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSQLite {

	public static void main(String args[]) throws ClassNotFoundException{
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		try
		{
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:/home/deep/database.db");
			//System.out.println(connection.isValid(5000));
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout to 30 sec.

			ResultSet rs = statement.executeQuery("select * from wines");
			while(rs.next()){
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("name = " + rs.getString("producer"));
				System.out.println("name = " + rs.getString("kind"));
				System.out.println("name = " + rs.getString("country"));
			}
			
		}catch(SQLException e){
			e.printStackTrace(); 
		}
	}
}

