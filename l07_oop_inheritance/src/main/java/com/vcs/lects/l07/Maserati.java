package com.vcs.lects.l07;

public class Maserati extends Auto {

	private String fridge;

	public Maserati(CarColor color) {
		super(color, "V12 8L 4Turbo");

		System.out.println();
	}

	public String getFridge() {
		return fridge;
	}

}
