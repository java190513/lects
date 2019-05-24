package com.vcs.lects.l09.trpriemones;

public class Paspirtukas extends TrPriemoneImpl {

	private double nuolydis = 1.0;

	public Paspirtukas() {

	}

	public Paspirtukas(double nuolydis) {
		this.nuolydis = nuolydis;
	}

	@Override
	public double judejimoGreitis() {
		return nuolydis * 6;
	}

	public double getNuolydis() {
		return nuolydis;
	}

	public void setNuolydis(double nuolydis) {
		this.nuolydis = nuolydis;
	}

}
