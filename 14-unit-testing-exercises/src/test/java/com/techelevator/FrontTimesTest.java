package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class FrontTimesTest {

	private FrontTimes testFrontTimes;
	
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
		testFrontTimes = new FrontTimes();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_generate_string_null_string_zero_n() {
		int n = 1;
		String str = null;
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("does not pass the test for a null string",null, result);	
	}
	
	@Test
	public void test_generate_string_empty_string_four_n() {
		int n = 4;
		String str = "";
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("", result);	
	}
	
	@Test
	public void test_generate_string_empty_string_zero_n() {
		int n = 0;
		String str = "";
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("", result);	
	}
	
	@Test
	public void test_generate_string_ten_characters_n_three() {
		int n = 3;
		String str = "1234567890";
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("123123123", result);	
	}
	
	@Test
	public void test_generate_string_two_characters_n_three() {
		int n = 3;
		String str = "12";
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("121212", result);	
	}
	
	@Test
	public void test_generate_string_ten_characters_n_five() {
		int n = 5;
		String str = "1234567890";
		String result = testFrontTimes.generateString(str, n);
		Assert.assertEquals("123123123123123", result);	
	}
	
	

}