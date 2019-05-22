package com.vcs.lects.l08;

public class Trabant extends Auto {

	private int speed;

	public Trabant(int speed) {
		super(CarColor.MUD_DIRTY, "noname");
		setWheels(3);
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Trabant [getEngine()=" + getEngine() + ", getColor()=" + getColor() + ", getWheels()=" + getWheels()
				+ "]";
	}

	@Override
	public String uzvedimas() {
		return "is kojos";
	}

	@Override
	public double judejimoGreitis() {

		return speed;
	}

}
