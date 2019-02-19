package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PermutationTest {

	private static Permutation p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	p= new Permutation();
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
	public void testSwap() {
		String a=p.swap("abc", 0, 0);
		assertEquals("ab", p);
		//fail("Not yet implemented");
	}

}
