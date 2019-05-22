package com.vcs.lects.l08;

public abstract class TrPriemoneImpl implements TrPriemone {

	private int wheels = 4;

	public void move() {

		if (wheels > 0) {
			System.out.println("vaziuoja nuo A iki B su " + wheels + " ratais");
		} else {
			System.out.println("juda...");
		}

	}

	public abstract double judejimoGreitis();

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
