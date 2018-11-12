package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class NonStartTest {

	private NonStart testNonStart;
	
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
		testNonStart = new NonStart();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_get_partial_string_with_null_strings() {
		String str1 = null;
		String str2 = null;
		String result = testNonStart.getPartialString(str1, str2);
		Assert.assertEquals(null, result);	
	}
	
	@Test
	public void test_get_partial_string_with_empty_strings() {
		String str1 = "";
		String str2 = "";
		String result = testNonStart.getPartialString(str1, str2);
		Assert.assertEquals("", result);	
	}
	
	@Test
	public void test_get_partial_string_with_one_character_strings() {
		String str1 = "1";
		String str2 = "2";
		String result = testNonStart.getPartialString(str1, str2);
		Assert.assertEquals("", result);	
	}
	
	@Test
	public void test_get_partial_string_with_two_characters_strings() {
		String str1 = "12";
		String str2 = "34";
		String result = testNonStart.getPartialString(str1, str2);
		Assert.assertEquals("24", result);	
	}
	
	@Test
	public void test_get_partial_string_with_two_andtour_characters_strings() {
		String str1 = "12";
		String str2 = "3456";
		String result = testNonStart.getPartialString(str1, str2);
		Assert.assertEquals("2456", result);	
	}
}
