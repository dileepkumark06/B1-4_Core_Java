package com.git.this1;

public class Example4 
{
	String str;
	Example4()
	{
		str="Dileep";
	}
	
	Example4 get() 
	{
		return this;
	}
	void display()
	{
		System.out.println("str");
	}
	public static void main(String[] args) 
	{
		Example4 e=new Example4();
		e.getdisplay();
	}

}