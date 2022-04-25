package com.git.junittesting;

import org.junit.jupiter.api.Assumptions;

public class JUnitTesting10 
{
	void accept()
	{
		System.setProperty("1", "Soujan");
		Assumptions.assumeTrue("Soujan".equals(System.getProperty("1")));
	}
	void accept1()
	{
		System.setProperty("2", "Vikram");
		Assumptions.assumeFalse("Vikram".equals(System.getProperty("2")));	 
	}
}