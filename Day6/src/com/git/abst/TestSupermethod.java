package com.git.abst;

class Ani
{  
Ani()
	{
	System.out.println("animal is created");
	}  
}  
class Dog extends Ani
	{  
	Dog()
	{  
super();  
System.out.println("dog is created");  
}  
}  
class TestSupermethod
{  
public static void main(String args[])
	{  
	Dog d=new Dog();  
	}
}