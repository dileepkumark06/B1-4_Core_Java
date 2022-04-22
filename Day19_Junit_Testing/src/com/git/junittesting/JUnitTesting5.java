package com.git.junittesting;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class JUnitTesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "Shashank");
		Assumptions.assumeFalse("Shashank").equal(System.getProperty("2"));
	}
}