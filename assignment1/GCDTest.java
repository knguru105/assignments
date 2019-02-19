package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GCDTest {

	private static GCD gcd;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	gcd = new GCD(); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGcd_or_not() {
		int a=gcd.gcd_or_not(10, 20, 1);
		assertEquals(10, a);
		//fail("Not yet implemented");
	}

}
