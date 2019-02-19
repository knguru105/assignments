package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Searching10Test {

	private static Searching10 s;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		s= new Searching10();
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
	public void testSearch() {
		
		int a=s.search();
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
