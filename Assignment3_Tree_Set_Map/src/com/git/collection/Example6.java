package com.git.collection;

import java.util.ArrayDeque;

public class Example6 
{
	public static void main(String[] args) 
	{
		ArrayDeque a=new ArrayDeque();
		a.add(12);
		a.add("Nihal");
		a.addFirst(0.5);
		a.addLast('c');
		System.out.println(a);
	}
}