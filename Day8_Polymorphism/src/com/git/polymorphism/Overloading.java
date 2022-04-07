package com.git.polymorphism;

public class Overloading
{
	void assign(int a, int b)
		{
		System.out.println("Area of Rectangle: "+(a*a));
		}
	void assign(float a, float b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		o.assign(5,10);
		o.assign(10,20);
	}

}