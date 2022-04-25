package com.git.junittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class  JUnitTesting7 
{
	@AfterAll   
	static void display()
	{
		System.out.println("Soujan");
	}
	@Test
	void display1()
	{
		System.out.println("James");
	}
}