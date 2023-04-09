package week3day2;

import java.util.Arrays;

public class LearnStringMethods {

	public static void main(String[] args) {
		String s="testleaf";
		String company="Testleaf";
		
		if(s.equals(company)) {
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}

		if(s.equalsIgnoreCase(company)) {
			System.out.println("values are same");
		}else {
			System.out.println("Value are not same");
		}
		
		//count of characters in the String
		int length = s.length();
		System.out.println(length);
		
		System.out.println(s);
		//split the String into characters
		char[] charArray = s.toCharArray();		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[0]);
		//reterive character present in a specific location		
		System.out.println(s.charAt(0));
		
	}

}
