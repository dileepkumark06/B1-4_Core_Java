package com.git.exception;

public class Example7 
{
	public static void main(String[] args) 
	{
		System.out.println(Example7.myMethod()) ;
	}
	@SuppressWarnings("finally")
	public static int myMethod () 
	{
	 try 
	 {
	          int x = 63;
	          int y = 9;
	          @SuppressWarnings("unused")
			int z=x/y;
	          System.out.println("Inside try block");
	          System.exit(0);
	 }
	  catch (Exception exp)
	  {
	      System.out.println(exp);
	  }
	  finally
	  {
	      System.out.println("Java finally block");
	      return 0;
	  }
	}
}