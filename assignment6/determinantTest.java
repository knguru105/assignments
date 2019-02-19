package com.abc.assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class determinantTest {
	private static determinant d;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	d= new determinant();
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
	public void testGetCofactor() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeterminantOfMatrix() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDisplay() {
		int a[][]={{6, 1, 1},
				{4, -2, 5},
				{2, 8, 7}
				};
		int b=d.display(a, 3, 3);
		assertEquals(1, b);
		//fail("Not yet implemented");
	}

}
