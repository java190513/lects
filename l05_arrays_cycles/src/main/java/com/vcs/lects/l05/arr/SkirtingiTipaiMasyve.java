package com.vcs.lects.l05.arr;

public class SkirtingiTipaiMasyve {

	public static void main(String[] args) {

//		int[][] eilutesIlgis = { { 0 }, { 5, 7, 8, 0 } };

//		String[] eilutes = new String[3];
//
//		eilutes[0] = "Pirma eiulute";
//		eilutes[1] = "2 eiulute";
//		eilutes[2] = "3 eiulute";

		Eilute[] pastraipa = new Eilute[3]; // { null , null, null}
		Eilute vienaEil = new Eilute();

		pastraipa[0] = new Eilute();
		pastraipa[1] = new Eilute();
		pastraipa[2] = new Eilute();

		pastraipa[0].setTekstas("Pirma eiulute");
		pastraipa[1].setTekstas("");
		pastraipa[2].setTekstas("trecia eiulute");
		vienaEil.setTekstas("is vienos eilutes");

		System.out.println(pastraipa[0].getIlgis());
		System.out.println(pastraipa[1].getIlgis());
		System.out.println(pastraipa[2].getIlgis());
		System.out.println(vienaEil.getIlgis());
	}

}

class Eilute {

	private int ilgis;
	private String tekstas;

	public int getIlgis() {
		return ilgis;
	}

	public String getTekstas() {
		return tekstas;
	}

	public void setTekstas(String tekstas) {
		this.tekstas = tekstas;
		ilgis = tekstas.length();
	}

}