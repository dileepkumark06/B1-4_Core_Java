package com.git.polymorphism;

public class Overloading1 
{
	void assign(float a,float b)
	{
	System.out.println("Area of Rectangle:" +(a*a));
	}
void assign(int a, int b)
	{
	System.out.println("Area of Rectangle:" +(float) (a*b));
	}
public static void main(String[] args) 
	{
	Overloading1 o=new Overloading1();
	o.assign(5f,10f);
	o.assign(10,20);
	}
}