package com.git.exception;

import java.util.Scanner;
@SuppressWarnings("serial")
class NamenotFoundException extends Exception
	{
	    NamenotFoundException (String message)
	    {
	        super (message);
	    }
	}
public class Example10 
	 {
	    public static void main(String args[]) 
	    {
	      try (Scanner sc=new Scanner(System.in)) 
	      {
			String name=sc.nextLine();
			  try
			  {
			      customername (name);
			  }
			  catch (Exception e)
			  {	
			      System.out.print(e);
			  }
	      }
	    } 
 static void customername (String name) throws NamenotFoundException
	    {
	         if (name.isEmpty ())
	              throw new NamenotFoundException("Empty");
	          else
	          {
	              System.out.print ("Hi "+ name + ", Welcome to SP bank");
	          }
	    }
}