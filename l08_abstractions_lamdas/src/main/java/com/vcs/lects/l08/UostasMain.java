package com.vcs.lects.l08;

public class UostasMain {

	public static void main(String[] args) {

		int hOntrip = 2;

		TrPriemone[] visosTrPr = { new Trabant(30), new Maserati(CarColor.BALCK, MaseratiEngine.TDI1_9),
				new Paspirtukas(1.5), new Fiat(), new PramoginisKateris(), new Maserati(CarColor.GOLD), new Valtis(2.5), new Ocean3000() };

		for (TrPriemone trPriemone : visosTrPr) {

			if (trPriemone instanceof Variklis) {
				System.out.print(trPriemone.getClass().getSimpleName() + " : " + ((Variklis) trPriemone).uzvedimas());
			} else {
				System.out.print(trPriemone.getClass().getSimpleName() + " : -");
			}

			System.out.println(" per " + hOntrip + "h atsidure uz: " + (trPriemone.judejimoGreitis() * hOntrip));

		}

	}

}
