package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class MaxEnd3Test {

	private MaxEnd3 testMaxEnd3;
	
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
		testMaxEnd3 = new MaxEnd3();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_make_array_with_array_size_zero() {
		int[] nums = new int[0];
		int[] result = testMaxEnd3.makeArray(nums);
		Assert.assertEquals(nums, result);	
	}	
	
	@Test
	public void test_make_array_with_array_size_one() {
		int[] nums = {1};
		int[] result = testMaxEnd3.makeArray(nums);
		Assert.assertEquals(nums, result);	
	}
	
	@Test
	public void test_make_array_with_array_size_two() {
		int[] nums = {1, 3};
		int[] result = testMaxEnd3.makeArray(nums);
		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(3, result[1]);
		
	}
	
	@Test
	public void test_make_array_with_array_size_three() {
		int[] nums = {1, 2, 3};
		int[] result = testMaxEnd3.makeArray(nums);
		Assert.assertEquals(3, result[0]);	
		Assert.assertEquals(3, result[1]);	
		Assert.assertEquals(3, result[2]);	
	}
	
	@Test
	public void test_make_array_with_array_size_four_and_negative_numbers() {
		int[] nums = {-1, 3, 4, -5};
		int[] result = testMaxEnd3.makeArray(nums);

		Assert.assertEquals(-1, result[0]);	
		Assert.assertEquals(-1, result[1]);	
		Assert.assertEquals(-1, result[2]);	
		Assert.assertEquals(-1, result[3]);	
	}

}