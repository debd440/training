package com.deb.ds.core.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormLargestNumber {
	// Form Large Value form an Array
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(40);
		list.add(50);
		list.add(7);

		// Comparsion is the key.
		// Start with 2nd variable for biggest value
		// Start with 1st variable for lowest value
		Collections.sort(list, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));

		StringBuilder builder = new StringBuilder();
		for (Integer data : list) {
			builder.append(data);
		}

		System.out.println("Largest Value: " + builder.toString());
	}
}
