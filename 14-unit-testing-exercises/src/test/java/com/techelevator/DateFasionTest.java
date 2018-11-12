package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class DateFasionTest {

	private DateFashion testDateFasion;
	
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
		testDateFasion = new DateFashion();
	}
	
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_get_a_table_you_10_date_10() {
		int you = 10;
		int date = 10;
		int chanceToGetATable = testDateFasion.getATable(you, date);
		Assert.assertEquals(2, chanceToGetATable);	
	}
	
	@Test
	public void test_get_a_table_you_10_date_2() {
		int you = 10;
		int date = 2;
		int chanceToGetATable = testDateFasion.getATable(you, date);
		Assert.assertEquals(0, chanceToGetATable);	
	}
	
	@Test
	public void test_get_a_table_you_1_date_8() {
		int you = 1;
		int date = 8;
		int chanceToGetATable = testDateFasion.getATable(you, date);
		Assert.assertEquals(0, chanceToGetATable);	
	}
	
	@Test
	public void test_get_a_table_you_1_date_6() {
		int you = 1;
		int date = 6;
		int chanceToGetATable = testDateFasion.getATable(you, date);
		Assert.assertEquals(0, chanceToGetATable);	
	}
	
	@Test
	public void test_get_a_table_you_6_date_6() {
		int you = 6;
		int date = 6;
		int chanceToGetATable = testDateFasion.getATable(you, date);
		Assert.assertEquals(1, chanceToGetATable);	
	}
}