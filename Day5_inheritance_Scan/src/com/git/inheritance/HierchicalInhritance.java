package com.git.inheritance;

class CellPhones
{
	void message() 
	{
		System.out.println("Hi,Lohith");
	}
	void call() 
	{
		System.out.println("I am calling kishor");
	}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class HierchicalInhritance 
{

	public static void main(String[] args) 
	{
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();	
		SamsungGalaxyM31 m= new SamsungGalaxyM31();
		m.facelock();
	}
}
