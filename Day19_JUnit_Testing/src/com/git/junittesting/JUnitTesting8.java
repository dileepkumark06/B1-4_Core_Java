package com.git.junittesting;

import org.junit.jupiter.api.Assumptions;

public class JUnitTesting8 
{
	void accept()
	{
		System.setProperty("1", "Soujan");
		Assumptions.assumeTrue("Soujan".equals(System.getProperty("2")));	 
	}
}