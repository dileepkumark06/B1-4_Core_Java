package com.git.junittesting;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

public class JUnitTesting4 
{
	@AfterAll
	static void display()
	{
		System.out.println("Dileep");
	}
	
	@Test
	void display1()
	{
		System.out.println("Kamal");
	}
}