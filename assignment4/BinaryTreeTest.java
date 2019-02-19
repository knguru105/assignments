package com.abc.assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryTreeTest {
	private static BinaryTree b;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	b= new BinaryTree();
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
	public void testIsBST() {
		boolean a=b.isBST();
		assertEquals(true, a);
		//fail("Not yet implemented");
	}

}
