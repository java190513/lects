package com.vcs.lects.l07;

public class Street {

	public static void main(String[] args) {

		Trabant limo = new Trabant();

		Auto fiat = new Auto(CarColor.WHITE, "kazkoks...");
		fiat.setWheels(3);

		Maserati model1 = new Maserati(CarColor.GOLD);

		Valtis v = new Valtis();

		limo.move();
		fiat.move();
		model1.move();
		v.move();

		/**
		 * Parking stuff
		 * 
		 */

		Auto[] parkingAutoOnly = new Auto[3]; // {null, null, null}

		parkingStatus(parkingAutoOnly);

		parkingAutoOnly[0] = fiat;

		parkingStatus(parkingAutoOnly);

		parkingAutoOnly[0] = model1;

		parkingStatus(parkingAutoOnly);

		parkingAutoOnly[2] = limo;

		parkingStatus(parkingAutoOnly);

//		parkingAutoOnly[1] = v;

	}

	private static void parkingStatus(Auto[] parking) {
		System.out.println();
		for (Auto auto : parking) {

			if (auto != null) {
				
				System.out.println( auto.getClass().getSimpleName() );
				
//				if (auto instanceof Maserati) {
//					System.out.println("Maserati ir taskas");
//				} else if (auto instanceof Trabant) {
//					System.out.println("nu bet vaziuoja gi ir gerai :)");
//				} else {
//					System.out.println("kazkoks ten modelis, kazkokia ten pilka spalva...");
//				}
			} else {
				System.out.println("[]");
			}
		}
	}
	
	
	
	
	
	
	

}
