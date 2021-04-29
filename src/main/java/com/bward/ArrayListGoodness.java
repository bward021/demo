package com.bward;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGoodness {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
//		try {
//			if (names != null && names.size() > 0) {
				names.add("Bob");
				System.out.println("Current values: " + names);
				System.out.println("list contains bob? " + names.contains("Bob"));

				names.add("Bob");
				System.out.println("Current values: " + names);
				for (String name : names) {
					System.out.println(name);
				}
//				for (int i = 0 ; i < 10 ; i++) {
//					System.out.println(names.get(i));
//				}
//			}
//		} catch (IndexOutOfBoundsException e) {
//			System.err.println("ERROR! " + e.getMessage());
//			e.printStackTrace();
//		} finally {
//			System.out.println("My cat can eat a whole watermelon!!!");
//		}
		
	}
}
