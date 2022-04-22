package com.git.junittesting;

import static  org.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JUnitTesting2 
{
	@Test
	void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
}