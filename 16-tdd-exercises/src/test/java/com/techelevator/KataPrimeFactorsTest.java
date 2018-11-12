package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactorsTest {

	@Test
	public void input_of_31689_returns_3_3_7_503() {
		int input = 31689;

		List<Integer> result = new ArrayList<Integer>();
		System.out.println("Original number: " + input);
		result = KataPrimeFactors.factorize(input);
		String str = result.toString();
		System.out.println("Prime factors: " + str);
		Assert.assertEquals("[3, 3, 7, 503]", str);
		System.out.println("");
	}
	
	@Test
	public void input_of_316890_returns_2_3_3_5_7_503() {
		int input = 316890;

		List<Integer> result = new ArrayList<Integer>();
		System.out.println("Original number: " + input);
		result = KataPrimeFactors.factorize(input);
		String str = result.toString();
		System.out.println("Prime factors: " + str);
		Assert.assertEquals("[2, 3, 3, 5, 7, 503]", str);
		System.out.println("");
	}
	
}