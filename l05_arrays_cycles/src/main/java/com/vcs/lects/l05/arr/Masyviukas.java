package com.vcs.lects.l05.arr;

public class Masyviukas {

	public static void main(String[] args) {

		Person[] pers = null;

		Masyviukas m = new Masyviukas();
		System.out.println(m.findLast(pers));

	}

	public Person findLast(Person[] persons) {

		if (persons != null && persons.length > 0) {
			return persons[persons.length - 1];
		}

		return null;

	}

}

class Person {

}