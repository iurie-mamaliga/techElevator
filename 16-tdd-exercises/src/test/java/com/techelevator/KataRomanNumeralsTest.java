package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	@Test
	public void test_invalid_lower_bound() {
		
		for(int i = Integer.MIN_VALUE; i < 1; i++) {
			Assert.assertNull(KataRomanNumerals.romify(i));
		}
	}
	
	@Test
	public void test_upper_bound_input() {
		
		for(int i = Integer.MAX_VALUE; i <= 1; i++) {
			Assert.assertNull(KataRomanNumerals.romify(i));
		}

	}
	
	
	@Test
	public void input_of_1_returns_I() {
		int input = 1;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("I", result);
	}
	
	@Test
	public void input_of_5_returns_V() {
		int input = 5;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("V", result);
	}
	
	@Test
	public void input_of_10_returns_X() {
		int input = 10;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("X", result);
	}
	
	
	@Test
	public void input_of_50_returns_L() {
		int input = 50;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("L", result);
	}
	
	@Test
	public void input_of_100_returns_C() {
		int input = 100;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("C", result);
	}
	
	@Test
	public void input_of_500_returns_D() {
		int input = 500;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("D", result);
	}
	
	@Test
	public void input_of_1000_returns_M() {
		int input = 1000;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("M", result);
	}
	
	
	@Test
	public void input_of_14_returns_XIV() {
		int input = 14;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("XIV", result);
	}
	@Test
	public void input_of_86_returns_XIV() {
		int input = 86;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("LXXXVI", result);
	}
	
	@Test
	public void input_of_147_returns_XIV() {
		int input = 147;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("CXLVII", result);
	}
	
	@Test
	public void input_of_2018_returns_XIV() {
		int input = 2018;

		String result = KataRomanNumerals.romify(input);
		
		Assert.assertEquals("MMXVIII", result);
	}
}
