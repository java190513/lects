package com.vcs.lects.l07;

public class Trabant extends Auto {

	public Trabant() {
		super(CarColor.MUD_DIRTY, "noname");
		setWheels(3);
	}

	@Override
	public String toString() {
		return "Trabant [getEngine()=" + getEngine() + ", getColor()=" + getColor() + ", getWheels()=" + getWheels()
				+ "]";
	}

}
