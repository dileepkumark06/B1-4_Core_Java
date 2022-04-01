package com.git.inheritance;

class R6
{
	void print()
	{
		System.out.println("This is R6");
	}
}

class R3 extends R6
{
	void display()
	{
		System.out.println("This is R3");
	}
}
class R15 extends R3
{
	void assign()
	{
		System.out.println("This is R15");
	}
}
public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		R15 r=new R15();
		r.print();
		r.display();
		r.assign();
	}
}
