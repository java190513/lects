package com.vcs.lects.l08;

public abstract class Auto extends TrPriemoneImpl implements Variklis {

	private String engine = "1.9 TDI";
	private CarColor color = CarColor.GREY;

	public Auto(CarColor color, String engine) {

		this.color = color;
		this.engine = engine;

	}

	public Auto() {

	}

	public String getEngine() {
		return engine;
	}

	public CarColor getColor() {
		return color;
	}

	@Override
	public void move() {

		System.out.println("Vaziuoj kai masin");

	}
}
