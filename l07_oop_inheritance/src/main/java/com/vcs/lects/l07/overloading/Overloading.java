package com.vcs.lects.l07.overloading;

public class Overloading {

	public static void main(String[] args) {

		Overloading o = new Overloading();
		o.spausdinkSk(1, 2L);
		// o.spausdinkSk(1.0f);

		o.spausdinkSk(new Person("Petras"));
	}

	public void spausdinkSk(Person p) {
		System.out.println("Asmuo: " + p.getVardas());
	}

	public void spausdinkSk(int sk) {
		System.out.println("Sveikasis: " + sk);
	}

	public void spausdinkSk(double sk) {
		System.out.println("Su kableliu: " + sk);
	}

	public void spausdinkSk(int... sks) {
		System.out.println("Sveiku Masyvas is " + sks.length + " : ");
		for (int i : sks) {
			spausdinkSk(i);
		}
	}

	public void spausdinkSk(double... sks) {
		System.out.println("Nesveiku Masyvas is " + sks.length + " : ");
		for (double i : sks) {
			spausdinkSk(i);
		}
	}

}

class Person {
	private String vardas;

	public Person(String string) {
		setVardas(string);
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

}
