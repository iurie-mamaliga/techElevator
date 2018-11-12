package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class StringBitsTest {

	private StringBits testStringBits;
	
	@BeforeClass
	public static void doThisOnceAtTheVeryBeginning() {
	    System.out.println("Starting Up");
	}
	
	@AfterClass
	public static void doThisOnceAtTheVeryEnd() {
	    System.out.println("Shutting Down");
	}

	@Before
	public void setup() {
		testStringBits = new StringBits();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_get_bits_with_null_string() {
		String str = null;	
		String result = testStringBits.getBits(str);
		Assert.assertEquals(null, result);	
	}
	
	@Test
	public void test_get_bits_with_empty_string() {
		String str = "";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals(str, result);	
	}
	
	@Test
	public void test_get_bits_with_one_character_string() {
		String str = "o";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals(str, result);	
	}
	
	@Test
	public void test_get_bits_with_two_character_string() {
		String str = "He";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals("H", result);	
	}
	
	@Test
	public void test_get_bits_with_three_character_string() {
		String str = "Hel";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals("Hl", result);	
	}
	
	@Test
	public void test_get_bits_with_four_character_string() {
		String str = "Hell";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals("Hl", result);	
	}
	
	@Test
	public void test_get_bits_with_five_character_string() {
		String str = "Hello";	
		String result = testStringBits.getBits(str);
		Assert.assertEquals("Hlo", result);	
	}
	
	
	

	
	
}