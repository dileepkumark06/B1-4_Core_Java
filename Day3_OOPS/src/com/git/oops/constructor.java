package com.git.oops;

public class constructor {

	String str;
	int a;
	constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) 
	{
		constructor c=new constructor("Soujan",55);
		c.display();
	}

}