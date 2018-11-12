package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class SameFirstLastTest {

	private SameFirstLast testSameLast;
	
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
		testSameLast = new SameFirstLast();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_is_it_the_same_with_array_length_zero() {
		int[] nums = new int[0];
		boolean result = testSameLast.isItTheSame(nums);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_is_it_the_same_with__array_size_one() {
		int[] nums = new int[1];
		boolean result = testSameLast.isItTheSame(nums);
		Assert.assertEquals(true, result);	
	}
	
	@Test
	public void test_is_it_the_same_with_three_elements_in_array() {
		int[] nums = {1, 2, 3};
		boolean result = testSameLast.isItTheSame(nums);
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void test_is_it_the_same_with_four_elements_in_array() {
		int[] nums = {-1, 2, 1, -1};
		boolean result = testSameLast.isItTheSame(nums);
		Assert.assertEquals(true, result);	
	}
	
	
}