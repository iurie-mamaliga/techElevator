package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KataRomanNumerals {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		String  result = romify(10);	
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);	
	}
	
	public static String romify(int input) {
		if(input < 1 || input > 4000) {
			return null;
		}
		String result = "";
		
		Map<String, Integer> romanMap = new LinkedHashMap<String, Integer>();
		romanMap.put("M", 1000);
		romanMap.put("CM", 900);
		romanMap.put("D", 500);
		romanMap.put("CD", 400);
		romanMap.put("C", 100);
		romanMap.put("XC", 90);
		romanMap.put("L", 50);
		romanMap.put("XL", 40);
		romanMap.put("X", 10);
		romanMap.put("IX", 9);
		romanMap.put("V", 5);
		romanMap.put("IV", 4);
		romanMap.put("I", 1);
		
		
		
		for(Map.Entry<String, Integer> kv : romanMap.entrySet()) {
			while(input >= kv.getValue()) {
				result += kv.getKey();
				input -= kv.getValue();
			}
		}
		return result;
	
}}
