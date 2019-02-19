package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Fibonacci_seriesTest {

	private static Fibonacci_series fb;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fb= new Fibonacci_series();
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
	public void testFibonacci_recursive() {
//		fb.fibonacci_recursive(-1, 1, 10);
		assertEquals(0, 0);
	}

	@Test
	
	public void testFibonacci() {
		int a=fb.fibonacci(6);
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
