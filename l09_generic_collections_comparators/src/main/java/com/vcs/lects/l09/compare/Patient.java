package com.vcs.lects.l09.compare;

public class Patient implements Comparable<Patient> {

	private int age;
	private String surname;

	public Patient(int age, String surname) {
		this.age = age;
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "" + age + " " + surname;
	}

	@Override
	public int compareTo(Patient o) {
		// -1 : esamas objektas yra pirmesnis
		// 0 : abu vienodi
		// 1 : esamas objektas yra paskesnis

		if (o.age - age != 0) {
			return o.age - age;
		}

		return surname.compareToIgnoreCase(o.surname);
	}
}
