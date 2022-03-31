package com.git.oops;

public class Nonpara
{
	String str;
	int a;
	Nonpara()
	{
		str="Soujan";
		a=11;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) 
	{
		Nonpara c=new Nonpara();
		c.display();
	}

}