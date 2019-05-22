package com.vcs.lects.l08;

public class Maserati extends Auto {

	private String fridge;
	private MaseratiEngine engine = MaseratiEngine.V12_8L_4Turbo;

	public Maserati(CarColor color) {
		super(color, MaseratiEngine.V12_8L_4Turbo.toString());

		System.out.println();
	}

	public Maserati(CarColor color, MaseratiEngine engine) {
		super(color, engine.toString());
		this.engine = engine;

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
	public String uzvedimas() {
		return "remote uzvedimas";
	}

	@Override
	public double judejimoGreitis() {
		if (MaseratiEngine.V12_8L_4Turbo.equals(engine)) {
			return 275;
		}
		return 120;
	}

}

enum MaseratiEngine {
	V12_8L_4Turbo, TDI1_9
}
