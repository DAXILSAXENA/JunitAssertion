package com.bridgelabz.JunitAssertion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitAssertionTest {
	@Test
	public void testAssert() {

		// variable declaration
		String str1 = "Junit";
		String str2 = "Junit";
		assertEquals(str1, str2);
	}

}