package com.abc.assignment2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class reverse1Test {
	
	private static reverse1 r; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	r=new reverse1();
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
	public void testReverse() {
		String a=r.reverse("karan");
		assertEquals("narak", a);
		//fail("Not yet implemented");
	}

}
