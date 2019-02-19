package com.abc.assignment6;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GREPTest {

	private static GREP gr;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gr=new GREP();
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
	public void testDisplayResults() throws IOException {
		List<String> ls = new ArrayList<String>();
		ls.add("abc");
		ls.add("defsfgsagsfgsafgfsa");
		int a=gr.displayResults("abc",ls );
		
		//fail("Not yet implemented");
	}

}
