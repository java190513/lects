package com.vcs.lects.l09.trpriemones;

import com.vcs.lects.l09.trpriemones.varikliai.EVTurbo;
import com.vcs.lects.l09.trpriemones.varikliai.Variklis;

public class Maserati<MV extends Variklis> extends Auto<MV> {

	private String fridge;

	public Maserati(CarColor color, MV engine) {
		super(color, engine);

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

	@Override
	public double judejimoGreitis() {
		if (getVariklis() instanceof EVTurbo) {
			return 275;
		}
		return 120;
	}

}

enum MaseratiEngine {
	V12_8L_4Turbo, TDI1_9
}
