package com.vcs.lects.l09.trpriemones;

import com.vcs.lects.l09.trpriemones.varikliai.Variklis;
import com.vcs.lects.l09.trpriemones.varikliai.VidausDegimo;

public abstract class Auto<T extends Variklis> extends TrPriemoneImpl implements TuriVarikli<T> {

	private T engine;
	private CarColor color = CarColor.GREY;

	public Auto(CarColor color, T engine) {
		super();
		this.color = color;
		this.engine = engine;
	}

//	public Auto(CarColor color) {
//		this.color = color;
//		this.engine = new VidausDegimo();
//	}

	public Auto() {

	}

	public CarColor getColor() {
		return color;
	}

	@Override
	public void move() {
		System.out.println("Vaziuoj kai masin");
	}

	@Override
	public T getVariklis() {
		return engine;
	}
}
