package com.vcs.lects.l03.tasks;

public class PersonInitials {

	//

	public String createInitials(Person p) {

		String name = p.getName();
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

		String surname = p.getSurname();
		surname = surname.substring(0, 1).toUpperCase() + ".";

		return name + " " + surname;
	}

}
