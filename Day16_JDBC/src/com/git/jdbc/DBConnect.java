package com.git.jdbc;

import java.sql.Statement;

public class DBConnect 
{

	public static void main(String[] args) 
	{
String dbDriver="com.mysql.cj.jdbc.Driver";
String dbURL="jdbc:mysql://localhost/Capgemini";
String dbUserName="root";
String dbPassword="dileep";
String query="selct * from EnggStud"
try
{
	Class.forName(dbDriver);
}
catch(ClassNotFoundException e)
{
	e.printstackTrace();
}
try
{
	Connection c=DriveManager.getConnection(dbURL,dbUserName,dbPassword);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
}
while
	}

}
