package com.abc.assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinHeapTest {
	private static MinHeap mn;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	mn= new MinHeap(15);
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
	public void testMinHeap() {
		int a=mn.print();
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
