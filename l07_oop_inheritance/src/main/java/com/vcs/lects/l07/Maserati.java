package com.vcs.lects.l07;

public class Maserati extends Auto {

	private String fridge;

	public Maserati(CarColor color) {
		super(color, "V12 8L 4Turbo");

		System.out.println();
	}

	@Override
	public void move() {

		System.out.println("Plaukia kai laivas nes kitu atveju tiesiog...");
		super.move();

	}

	public String getFridge() {
		return fridge;
	}

}
