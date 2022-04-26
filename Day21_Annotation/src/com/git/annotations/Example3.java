package com.git.annotations;

class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Hey Guys!");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Hurrah!");
	}
}
public class Example3 
{
	public static void main(String[] args) 
	{
		Parent1 p=new Parent1();
		p.print1();
	}
}