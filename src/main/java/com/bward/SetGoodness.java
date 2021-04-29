package com.bward;

import java.util.HashSet;
import java.util.Set;

public class SetGoodness {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Bob");
		System.out.println("Current values: " + names);
		System.out.println("list contains bob? " + names.contains("Bob"));
		names.add("Rufus");
		names.add("Bob");
		System.out.println("Current values: " + names);
	}
}
