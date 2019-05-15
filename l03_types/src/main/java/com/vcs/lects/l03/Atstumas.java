package com.vcs.lects.l03;

public class Atstumas {

	public static void main(String[] args) {

//		byte atstumas = 5;
//
//		long tukstKm = atstumas * 1000 * 1000 * 1000;
//		long kilometras = atstumas * 1000 * 1000;
//		long metras = atstumas * 1000;
//		long milimetras = atstumas;
//		
//		
//		System.out.println(milimetras);
//		System.out.println(metras);
//		System.out.println(kilometras);
//		System.out.println(tukstKm);

		long atstumas = 5;

		long milimetras = atstumas;
		long metras = milimetras * 1000;
		long kilometras = metras * 1000;
		long tukstKm = kilometras * 1000;

		System.out.println(milimetras);
		System.out.println(metras);
		System.out.println(kilometras);
		System.out.println(tukstKm);
		
		System.out.println();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);

	}

}
