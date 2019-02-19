package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimeTest {
	
	private static Prime p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	p= new Prime();
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
	public void testPrimeOrNot() {
		
		int a=p.primeOrNot();
		assertEquals(1, a);
		
		//fail("Not yet implemented");
	}

}
