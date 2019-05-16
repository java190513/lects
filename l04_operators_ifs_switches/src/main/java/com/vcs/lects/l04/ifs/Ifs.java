package com.vcs.lects.l04.ifs;

public class Ifs {

	public void metodas(double laukoTemp) {

		if (laukoTemp <= 0) {
			System.out.println("Ledas");

			if (laukoTemp < -30) {
				System.out.println("tu ledas");
			} else {
				System.out.println("tavo masina - ledas");
			}

		} else {
			karstoka(laukoTemp);
		}
		System.out.println("done");

	}

	private void karstoka(double temp) {
		if (temp >= 40) {
			System.out.println("tu visciukas orkaitej :)");
		}

	}

}
