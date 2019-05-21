package com.vcs.lects.l07.parking;

import com.vcs.lects.l07.Auto;
import com.vcs.lects.l07.CarColor;
import com.vcs.lects.l07.Kateris;
import com.vcs.lects.l07.Laivas;
import com.vcs.lects.l07.Paspirtukas;
import com.vcs.lects.l07.TrPriemone;
import com.vcs.lects.l07.Trabant;
import com.vcs.lects.l07.Valtis;

public class ParkingPort {

	private Auto[] auto;
	private Laivas[] laivai;

	public static void main(String[] args) {
		ParkingPort pp = new ParkingPort();
		pp.doOustasStuff();
	}

	private void doOustasStuff() {
		auto = new Auto[5];
		laivai = new Laivas[2];

		parking(new Trabant(), new Kateris(), new Auto(CarColor.BALCK, "dujom kazkoks"), new Paspirtukas());
		parking(new Trabant(), new Trabant(), new Trabant(), new Trabant(), new Trabant(), new Trabant(), new Trabant(),
				new Trabant(), new Trabant(), new Trabant());
		parking(new Kateris(), new Laivas(), new Valtis());

	}

	private void parking(TrPriemone... trps) {

		for (TrPriemone trp : trps) {

			System.out.print(trp.getClass().getSimpleName() + " : ");

			if (trp instanceof Auto) {

				autoParking((Auto) trp);

			} else if (trp instanceof Laivas) {

				laivaiPraking((Laivas) trp);

			} else {
				System.out.println("Atsiprasome, negalime niekuo padeti");
			}
		}

	}

	private void laivaiPraking(Laivas trp) {
		boolean arBuvoLaisvu = false;
		for (int i = 0; i < laivai.length; i++) {
			if (laivai[i] == null) {
				arBuvoLaisvu = true;
				laivai[i] = trp;
				System.out.println("Prisvartuota i: " + (i + 1));
				break;
			}
		}
		if (!arBuvoLaisvu) {
			System.out.println("Atleiskit nera vietu priplaukoje");
		}
	}

	private void autoParking(Auto trp) {
		boolean arBuvoLaisvu = false;
		for (int i = 0; i < auto.length; i++) {
			if (auto[i] == null) {
				arBuvoLaisvu = true;
				auto[i] = trp;
				System.out.println("Priparkuota i: " + (i + 1));
				break;
			}
		}
		if (!arBuvoLaisvu) {
			System.out.println("Atleiskit nera vietu");
		}
	}

}
