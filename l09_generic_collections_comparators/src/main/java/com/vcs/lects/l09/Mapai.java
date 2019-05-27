package com.vcs.lects.l09;

import java.util.HashMap;
import java.util.Map;

public class Mapai {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();

		m.put("1", "vienas");
		m.put("2", "two");
		m.put("2", "du");
		m.put("3", "trys");
		m.put("1", "one");
		m.put(null, "null");
		m.put(null, "asdasdasd");

		m.get("3"); // ??

		for (String val : m.values()) {
			System.out.println(val);
		}
		
		System.out.println();

		m.size(); // ?

		String neegzistuojantis = m.get("asdsa"); // null

		for (String key : m.keySet()) {
			System.out.println(key + " : " + m.get(key));
		}

		m.containsKey("1"); // ??
		m.containsValue("null"); // ??

	}

}
