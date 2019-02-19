package com.abc.assignment2;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rmv_DupTest {
	private static Rmv_Dup MAINTAIN_CHARS;
	private static Rmv_Dup rmv;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	rmv=new Rmv_Dup();
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
	public void testReadCharacters() {
		
		LinkedList<Character> list = MAINTAIN_CHARS.readCharacters("karan");
		String reverse ="";
		for(Character character : list) {
			reverse +=character;
		}
		assertEquals("hsira", reverse);
	}

}
