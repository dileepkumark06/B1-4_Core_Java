package com.git.oops;

public class constructor 
{
	String str;
	int a;
	constructor(String s,int x)
	{
		str=s;
		a=x;
	}
	void dispay()
	{
		System.out.println(str=" "+a);
	}
	public static void main(String[] args) 
	{
		constructor c=new constructor("Wwlcome",11);
		c.dispaly();
	}

}
