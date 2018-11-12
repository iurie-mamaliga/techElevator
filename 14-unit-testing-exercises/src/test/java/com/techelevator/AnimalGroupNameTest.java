package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class AnimalGroupNameTest {

	private AnimalGroupName testAnimalGroupName;
	
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
		testAnimalGroupName = new AnimalGroupName();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_get_herd_with_null_string() {
		String str = null;	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals(null, result);	
	}
	
	@Test
	public void test_get_herd_with_empty_string() {
		String str = "";	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals("unknown", result);	
	}
	
	@Test
	public void test_get_herd_with_uppercase_string() {
		String str = "DOG";	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals("Pack", result);	
	}
	
	@Test
	public void test_get_herd_with_lowercase_string() {
		String str = "deer";	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals("Herd", result);	
	}
	
	@Test
	public void test_get_herd_with_mixedcase_string() {
		String str = "cRocoDILe";	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals("Float", result);	
	}
	
	@Test
	public void test_get_herd_with_wrong_string() {
		String str = "Cat";	
		String result = testAnimalGroupName.getHerd(str);
		Assert.assertEquals("unknown", result);	
	}
	
	
}