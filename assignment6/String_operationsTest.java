package com.abc.assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class String_operationsTest {
	
	private static String_operations so;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	so= new String_operations();
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
	public void testCount() {
		
		int a=so.count("java is versatile");
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
