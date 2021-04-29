package com.bward;

import java.util.HashMap;
import java.util.Map;

public class HashMapGoodness {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(10);
		map.put(1, "Bob");
		map.put(2, "WuzHear");
		map.put(1, "Beef");
		
		System.out.println("Map details: " + map);
		System.out.println(map.get(2));
		System.out.println(map.get(3));
	}
}
