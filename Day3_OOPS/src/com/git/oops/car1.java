package com.git.oops;

public class car1
{
	String str;
	car1(String s)
	{
		str=s;
	}
	void display()
	{
		System.out.println("it is " +str);
	}

public static void main(String[] args)
{
	car1 a=new car1("Audi");
	car1 b=new car1("BMW");
	car1 m=new car1("Mercedses Benz");
	a.display();
	b.display();
	m.display();
}
}
