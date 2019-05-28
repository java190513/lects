package com.vcs.lects.l10.errors;

public class Formule {

	public static void main(String[] args) throws InterruptedException {

		Formule f = new Formule();

		try {
			System.out.println(f.metodas(null));
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("ai ai ai...");
			
		} finally {
			System.out.println("darbas su resursais done");
		}
		System.out.println("baigiau darba");

	}

	private String metodas(String text) {
		return darykSuTekstuKazka(text);

	}

	private String darykSuTekstuKazka(String text) {
		return "" + text.charAt(3);
	}

}
