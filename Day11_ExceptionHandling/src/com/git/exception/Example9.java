package com.git.exception;

import java.io.IOException;

public class Example9 
{
	void myMethod (int num)throws IOException,ClassNotFoundException
	{
	   if (num==1)
	      throw new IOException ("IOException Occurred");
	   else
	      throw new
	ClassNotFoundException ("ClassNotFoundException");
	}
	public static void main (String args[])
	{
	 try
	 {
		 Example9 obj=new Example9() ;
	      obj.myMethod(1);
	 }
	  catch (Exception ex)
	 {
	   System.out.println(ex);

	 }
	}
}