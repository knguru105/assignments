package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerTest {

	private static Power p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		p= new Power();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void test() {
		long val = p.power(2,3);
		assertEquals(8, val);
//		fail("Not yet implemented");
	}

}
