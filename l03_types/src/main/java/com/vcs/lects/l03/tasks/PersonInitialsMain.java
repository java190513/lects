package com.vcs.lects.l03.tasks;

public class PersonInitialsMain {

	public static void main(String[] args) {

		Person pers = new Person();
		pers.setName("oNA");
		pers.setSurname("oNuTe");

		PersonInitials pi = new PersonInitials();
		String result = pi.createInitials(pers);
		System.out.println(result);

	}

}
