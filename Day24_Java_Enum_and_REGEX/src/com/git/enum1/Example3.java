package com.git.enum1;

enum Bike
{
	Pulsar,R15,R3,KTM
}
public class Example3 
{

	public static void main(String[] args) 
	{
		Bike c=Bike.R15;
		switch(c)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
		}
	}
}