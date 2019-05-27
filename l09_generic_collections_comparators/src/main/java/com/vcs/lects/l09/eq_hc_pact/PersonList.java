package com.vcs.lects.l09.eq_hc_pact;

import java.util.HashMap;
import java.util.Map;

public class PersonList {

	public static void main(String[] args) {

		Map<Person, Integer> persons = new HashMap<>();

		persons.put(new Person("Petras", 56), 2);
		Person p = new Person("Petras", 56);
		persons.put(p, 5);
		persons.put(new Person("PETRAS", 56), 8);
		persons.put(new Person("Alius", 56), 1);
		persons.put(new Person("Petras", 0), 13);

		System.out.println("Kiekis: " + persons.size());

//		System.out.println(new String("Petras") == new String("Petras"));
//		
//		System.out.println(new Person("Petras", 56) == new Person("Petras", 56));
//		System.out.println(new Person("petras", 56).equals( new Person("PETRAS", 56)));
//		
//		System.out.println(new Person("petras", 56).hashCode());
//		System.out.println(new Person("petras", 56).hashCode());

		if (persons.containsKey(new Person("PETRAS", 56))) {
			System.out.println("radau " + persons.get(p));
		} else {
			System.out.println("neradau");
		}

		if (persons.containsKey(p)) {
			System.out.println("Pagal referenc'a radau");
		}

	}

}

/**
 * Jei perrasom equals() privalom perrasyti ir hashCode(), nes jei ne... tada
 * kartais veiks vienaip, kartais kitaip... ir tokio kodo greiau nerodyti.
 * 
 * 
 * <ul>
 * <li>1) Jeigu hashCode() sutampa, tai nereiskia jog equals() irgi sutaps. Jei
 * hashCode() nesutampa - equals() privalo nesutapti.</li>
 * <li>2) Jeigu equals() sutampa, hashCode() privalo sutapti.</li>
 * </ul>
 **/

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

//	@Override
//	public int hashCode() {
//		return ((name == null ? "" : name.toLowerCase()) + age).hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj == null) {
//			return false;
//		}
//
//		if (obj instanceof Person) {
//			Person person = (Person) obj;
//
//			String persNameNotCaseSensitive = "";
//			if (person.name == null) {
//				persNameNotCaseSensitive = "";
//			} else {
//				persNameNotCaseSensitive = person.name.toLowerCase();
//			}
//
//			boolean nameEq = persNameNotCaseSensitive.equals(name == null ? "" : name.toLowerCase());
//			boolean ageEq = person.age == age;
//			return nameEq && ageEq;
//		}
//
//		return false;
//	}
}
