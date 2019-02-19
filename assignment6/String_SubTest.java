package com.abc.assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class String_SubTest {

	private static String_Sub ss;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		ss=new String_Sub();
	
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
	public void testSubStringIndex() {
		int a=ss.subStringIndex("hello world", "world");
		assertEquals(5, a);
		//fail("Not yet implemented");
	}

}
