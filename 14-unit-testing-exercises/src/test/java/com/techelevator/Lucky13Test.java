package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class Lucky13Test {

	private Lucky13 testLucky13;
	
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
		testLucky13 = new Lucky13();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_get_lucky_array_size_zero() {
		int[] nums = new int[0];
		boolean result = testLucky13.getLucky(nums);
		Assert.assertEquals(true, result);	
	}
	
	@Test
	public void test_get_lucky_contains_ones_and_contains_threes() {
		int[] nums = {1, 2, 3, 4};
		boolean result = testLucky13.getLucky(nums);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_get_lucky_contains_ones_but_no_threes() {
		int[] nums = {1, 2, 1, 4};
		boolean result = testLucky13.getLucky(nums);
		Assert.assertEquals(false, result);	
	}

	@Test
	public void test_get_lucky_contains_trees_but_no_ones() {
		int[] nums = {3, 2, 3, 4, 7, 9};
		boolean result = testLucky13.getLucky(nums);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_get_lucky_does_not_contain_ones_or_threes() {
		int[] nums = {-1, 2, -3, 4};
		boolean result = testLucky13.getLucky(nums);
		Assert.assertEquals(true, result);	
	}
	
	

}