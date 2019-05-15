package com.vcs.lects.l03;

public class Types {

	Boolean arTikrai = false;
	boolean arNeTikrai = false;

	public static void main(String[] args) {

		int sk1 = 102;

		double sk2 = sk1;

		System.out.println(sk1);
		System.out.println(sk2);

		int asda = 0;
		Integer sdfsd;
		int abc = 111;

		Integer cba = null;

		// Boxing
		cba = abc;

		// Unboxing
		abc = cba;

		int didesnis = 130;

		if (Byte.MAX_VALUE >= didesnis) {

			byte mazesnis = (byte) didesnis;

			System.out.println(didesnis + " -> " + mazesnis);

		} else {
			System.out.println(":( netelpa: " + didesnis);
		}

	}

}
