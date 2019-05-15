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
		
		
		new Types().stringai();

	}

	private void booleanai() {

		boolean a = false;
		boolean b = true;

	}

	private void stringai() {

		
		String textukas = "" + 73246.6;
		
		
		
		
		char aa = '\n';
		
		System.out.println("tekstas su kabutemis");

		System.out.println("tekstas \"su\" kabutemis");

		System.out.println("is\nnaujos eilutes");

		//escape’o \escapep’as\
		System.out.println("escape’o \\escapep’as\\ ");

		//utf8 \u2700 ✀
		System.out.println("utf8 \\u2700 \u2600 "); 
		
		
		
		
		
		System.out.println();
		
		
		
	}

}














