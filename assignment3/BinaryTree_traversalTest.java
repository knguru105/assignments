package com.abc.assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryTree_traversalTest {
	private static BinaryTree_traversal bt;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	bt = new BinaryTree_traversal();
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
	public void testPrintLevelOrder() {
		
		int a=bt.printLevelOrder();
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
