package com.git.junittesting;

import static  org.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JUnitTesting3 
{
	@Test
	void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	@Disable
	void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}