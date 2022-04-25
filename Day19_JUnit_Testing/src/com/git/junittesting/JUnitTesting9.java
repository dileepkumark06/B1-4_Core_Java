package com.git.junittesting;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Assumptions;

public class JUnitTesting9 
{
	void accept()
	{
		System.setProperty("1", "Sanjay");
		Assertions.assertFalse("Sanjay".equals(System.getProperty("2")));	 
	}
}