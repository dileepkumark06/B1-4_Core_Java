package com.git.inheritance;

class Parent 
{
void print()
	{
	System.out.println("Hello,This is Dileep");
	}
}
class Child extends Parent 
{
	void display()
	{
		System.out.println("Single inheritance ");
	}
}
class Singleinheritance
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display();
		c.print();
	}

}
