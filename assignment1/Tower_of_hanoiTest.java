package com.abc.assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tower_of_hanoiTest {
	private static Tower_of_hanoi toh;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		toh = new Tower_of_hanoi();
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
	public void testSolveTowersOfHanoi() {
		toh.solveTowersOfHanoi(3,"A","B","C");
		assertEquals(6, toh);
		//fail("Not yet implemented");*/
	}

}
