package com.vcs.lects.l08;

public class Valtis extends Laivas {

	private double vejoGreitis;

	public Valtis(double vejoGreitis) {
		this.vejoGreitis = vejoGreitis;
	}

	@Override
	public double judejimoGreitis() {

		return 3.0 * vejoGreitis;
	}

}
