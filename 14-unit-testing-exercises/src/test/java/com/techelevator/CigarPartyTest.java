package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class CigarPartyTest {

	private CigarParty testCigarParty;
	
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
		testCigarParty = new CigarParty();
	}
	@After
	public void teardown() {
	    System.out.println("Test finished!");
	}
	
	@Test
	public void test_have_party_not_weekend_not_enough_cigars() {
		int cigars = 30;
		boolean isWeekend = false;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(false, party);	
	}
	
	@Test
	public void test_have_party_not_weekend_to_many_cigars() {
		int cigars = 70;
		boolean isWeekend = false;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(false, party);	
	}
	
	@Test
	public void test_have_party_not_weekend_right_amount_of_cigars_cigars() {
		int cigars = 50;
		boolean isWeekend = false;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(true, party);	
	}
	
	@Test
	public void test_have_party_is_weekend_not_enough_cigars() {
		int cigars = 30;
		boolean isWeekend = true;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(false, party);	
	}
	
	@Test
	public void test_have_party_is_weekend_to_many_cigars() {
		int cigars = 70;
		boolean isWeekend = true;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(true, party);	
	}
	
	@Test
	public void test_have_party_is_weekend_right_amount_of_cigars_cigars() {
		int cigars = 50;
		boolean isWeekend = true;
		boolean party = testCigarParty.haveParty(cigars,  isWeekend);
		Assert.assertEquals(true, party);	
	}
}

