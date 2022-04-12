package com.git.exception;

import java.io.IOException;
 class Example5 
 {
	void Example5(int num)throws IOException, ClassNotFoundException
	{
			if(num==1)
			throw new IOException("IOexception Occured");
			else
				throw new 
		ClassNotFoundException("ClassNotFoundException");	
	}
	public static void main(String[] args) 
	{
		try 
		{
			Example5 obj=new Example5();
			obj.Example5(1);
		}
		catch(Exception ex) 
		{
			System.out.println(ex);
		}
		
	}
}