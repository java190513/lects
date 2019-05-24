package com.vcs.lects.l09.trpriemones;

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
