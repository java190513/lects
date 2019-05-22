package com.vcs.lects.l08.anon;

public class Anon {

	// No method declaration - anonymous
	{
		System.out.println("Anoniminis blokas");
	}

	public static void main(String[] args) {

		// Anonymous class - no name
		Abc abc = new Abc() {

			@Override
			public void metodas() {
				System.out.println("Anonimine klase: " + getClass().getSimpleName());
			}
		};

		abc.metodas();

		// Anonymous variable - no name & Anonymous class - no name
		new Abc() {

			@Override
			public void metodas() {
				System.out.println("Anonimine klase su anoniminiu kintamuoju: " + getClass().getSimpleName());

			}
		}.metodas();

		// Lambdas example
		Abc abcLambda = () -> System.out.println("Lambda :)");
		abcLambda.metodas();

		Def fed = (s) -> System.out.println(s);

		fed.printinkIKonsole("asdsad");
		fed.printinkIKonsole("antra eilute");

		Def fed2 = System.out::println;

		fed2.printinkIKonsole("asdsad");
		fed2.printinkIKonsole("antra eilute");
	}

}

interface Abc {
	void metodas();
}

interface Def {
	void printinkIKonsole(String text);
}
