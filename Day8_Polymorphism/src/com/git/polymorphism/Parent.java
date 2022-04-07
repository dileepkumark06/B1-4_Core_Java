package com.git.polymorphism;

public class Parent {

}


package com.polymorphism;

class Base {
	void method1()
	{
		System.out.println("Parent1");
	}
}
class derived extends Base
{
	void method1()
	{
		System.out.println("Child1");
	}
	public static void main(String[] args) 
	{
		Base b=new Base();
		b.method1();
		derived d=new derived();
		d.method1();
	}

}