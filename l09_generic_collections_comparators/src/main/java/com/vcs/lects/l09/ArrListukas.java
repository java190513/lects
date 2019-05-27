package com.vcs.lects.l09;

import java.util.ArrayList;
import java.util.List;

public class ArrListukas {

	/**
	 * list.add();
list.addAll();
list.set();
list.remove();
list.removeAll();
list.get();
list.indexOf();
list.size();
list.isEmpty();
list.contains();
list.clear();
Reikšmių išvedimas

	 * 
	 * */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		list.add(2, "aaa");
		list.set(1, "222");
		
		List<String> atitionalList = new ArrayList<>();
		atitionalList.add("AAA");
		atitionalList.add("BBB");
		
		list.addAll(atitionalList);
		
		list.remove("AAA");
		list.remove(0);
		
		list.removeAll(atitionalList);
		
		
		System.out.println( list.get(1) );
		
		list.add("4");
		System.out.println( list.indexOf("4") );
		
		
		System.out.println( list.size() );
		
		boolean arTuscias = list.isEmpty();
		boolean arNeTuscias = ! list.isEmpty();
		
		boolean arYraSarase = list.contains("5");
		
		list.clear();
		
		System.out.println("---");
		for (String valueOfList : list) {
			System.out.println(valueOfList);
		}
		System.out.println("---");

	}
	
	private void suPersonais() {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("", 0));

		List<int[]> listOfIntsArr = new ArrayList<>();
		
		List<List<String>> listsOfLists = new ArrayList<>();
		listsOfLists.add(new ArrayList<String>());
		
		
	}
	
	
	

}
