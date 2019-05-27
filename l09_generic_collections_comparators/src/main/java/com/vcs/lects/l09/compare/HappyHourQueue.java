package com.vcs.lects.l09.compare;

import java.util.Comparator;

public class HappyHourQueue implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		// -1 : esamas objektas yra pirmesnis
		// 0 : abu vienodi
		// 1 : esamas objektas yra paskesnis

		if (o2.getAge() - o1.getAge() != 0) {
			return o1.getAge() - o2.getAge();
		}

		return o1.getSurname().length() - o2.getSurname().length();
	}

}
