package com.vcs.lects.l09.trpriemones;

import com.vcs.lects.l09.trpriemones.varikliai.VidausDegimo;

public class Trabant extends Auto<VidausDegimo> {

	public Trabant(int speed) {
		super(CarColor.MUD_DIRTY, new VidausDegimo());
		setWheels(3);
	}

	@Override
	public String toString() {
		return "Trabant [getEngine()=" + getVariklis() + ", getColor()=" + getColor() + ", getWheels()=" + getWheels()
				+ "]";
	}

	@Override
	public double judejimoGreitis() {
		// TODO Auto-generated method stub
		return 0;
	}

}
