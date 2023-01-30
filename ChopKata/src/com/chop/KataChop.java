package com.chop;

import java.util.Arrays;

public class KataChop {

	public static void main(String[] args) {
		
		int[] one = {10,20,30,40};
		String[] two = {"banan", "orange", "grage", "pear"};
		
		System.out.println("The original array is: ");
		for (int num : one) {
			System.out.print(num + " ");
		}
		Arrays.sort(one);
		System.out.println("\nThe sorted array is: ");
		for (int num : one) {
			System.out.print(num + " ");
		}
		
	}

}
