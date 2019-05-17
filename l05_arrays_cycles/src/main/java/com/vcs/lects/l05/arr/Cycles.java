package com.vcs.lects.l05.arr;

public class Cycles {

	public void forCycles() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}
	
	public static void main(String[] args) {
		new Cycles().names();
	}

	private void names() {
		String[] vardai = { "Justina", "Andrius", "Mindaugas", "Arminas", "Martynas", "Tomas" };

		// Spausdins visus vardus is eiles

		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[i]);
		}
		
		
		System.out.println();

		for (int i = vardai.length - 1; i >= 0; i--) {
			System.out.println("Vardas    : " + vardai[i]);
		}
		
		
		System.out.println();

		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[vardai.length - i - 1]);
		}
		
		
		
		
		while (true) {
			
	
		}
		
		
//		System.out.println();
		
		

	}

}
