package com.vcs.lects.l09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollUtil {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		List<String> atitionalList = new ArrayList<>();
		atitionalList.add("AAA");
		atitionalList.add("BBB");

		Collections.addAll(atitionalList, "a","b","c","d","e");
		Collections.indexOfSubList(atitionalList, list);
		Collections.frequency(list, "3");
		Collections.replaceAll(list, "3", "trys");
		Collections.reverse(list);
		Collections.shuffle(list);
		Collections.sort(list);

	}

}
