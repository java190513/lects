package com.vcs.lects.l05.tasks;

public class PersonConverter {

	public static void main(String[] args) {
		PersonConverter pc = new PersonConverter();

		Person aaa = pc.personFromString("Ona Onute 4485465456 1984 mot");

		System.out.println(aaa.getVardas());

	}

	/**
	 * "Ona Onute 4485465456 1984 mot" -> Person
	 * 
	 * "Algis Antanas Žigas 3485465456 1984 vyr"
	 * 
	 * 
	 */

	public Person personFromString(String strData) {

		return null;
	}

}
