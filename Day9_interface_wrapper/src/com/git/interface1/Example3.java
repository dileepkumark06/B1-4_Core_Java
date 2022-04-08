package com.git.interface1;

public class Example3 
{
	void myMethod();
}
interface Example31 {
	void myOtherMethod();
}
class Dileep implements Example3,Example31 {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
class Main
	{
	public static void main(String[] args) {
		Dileep myObj = new Dileep();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}
}