package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class Less20Test {

	private Less20 testLess20;
	
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
		testLess20 = new Less20();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_20() {
		int n = 20;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_19() {
		int n = 19;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(true, result);	
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_18() {
		int n = 18;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(true, result);	
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_21() {
		int n = 21;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_22() {
		int n = 22;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_is_less_than_multiple_of_20_parameter_0() {
		int n = 0;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(false, result);	
	}

	@Test
	public void test_is_less_than_multiple_of_20_parameter_98() {
		int n = 98;
		boolean result = testLess20.isLessThanMultipleOf20(n);
		Assert.assertEquals(true, result);	
	}

	
	

}