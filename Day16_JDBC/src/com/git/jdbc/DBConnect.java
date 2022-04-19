package com.git.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect 
{
	public static void main(String[] args) 
	{
	String dbDriver="com.mysql.cj.jdbc.Driver";
	String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini";
	String dbUserName="root";
	String dbPassword="dileep";
	String query="select * from EnggStud";
	try
	{
		Class.forName(dbDriver);
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	try
	{
		Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		Statement st=c.createStatement();
		ResultSet rs=st.executeQuery(query);
		
	while(rs.next())
	{
		String Stud_data=" ";
		for(int i=1;i<=2;i++)
		{
			Stud_data=Stud_data+" "+rs.getString(i);
		}
		System.out.println(Stud_data);
	}
  }
catch(SQLException e)
{
	System.out.println("An error occured.Maybe password/user name is invalid");	
	e.printStackTrace();
}
	}
}