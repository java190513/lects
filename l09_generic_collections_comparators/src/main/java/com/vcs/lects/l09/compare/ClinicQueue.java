package com.vcs.lects.l09.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClinicQueue {

	public static void main(String[] args) {

		List<Patient> queue = new ArrayList<>();

		queue.add(new Patient(22, "Siaudvytis"));
		queue.add(new Patient(30, "Petrauskas"));
		queue.add(new Patient(99, "Jonautis"));
		queue.add(new Patient(40, "Žvinys"));
		queue.add(new Patient(40, "žilinskiene"));
		queue.add(new Patient(41, "Žukauskas"));
		queue.add(new Patient(30, "Petravicius"));
		queue.add(new Patient(30, "Pavardauskas"));

		Collections.sort(queue);

		for (Patient patient : queue) {
			System.out.println(patient.toString());
		}

		System.out.println();

		Collections.sort(queue, new HappyHourQueue());

		for (Patient patient : queue) {
			System.out.println(patient.toString());
		}

	}

}
