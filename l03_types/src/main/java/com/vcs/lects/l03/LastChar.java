package com.vcs.lects.l03;

public class LastChar {

	public static void main(String[] args) {

		// 1
		System.out.println(new LastChar().lastChar("Abc"));

		// 2
		System.out.println(new LastChar().lastChar("kashdkjashdkjsahdkjhsadkjhksajhdkashkjahdslkjsadlkjsalkdjdkashdkna,smdn,andk"));

		// 3
		System.out.println("[" + new LastChar().lastChar("9832749832 ") + "]");

	}

	private char lastChar(String text) {

		int lastIndex = text.length() - 1;
		char lastChar = text.charAt(lastIndex);

		return lastChar;

	}

}
