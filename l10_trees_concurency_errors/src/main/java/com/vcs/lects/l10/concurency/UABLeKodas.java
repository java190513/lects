package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class UABLeKodas {

	private static final int SPEED = 1;

	public static void main(String[] args) {

		Jira jira = new Jira();

		List<Testuotojas> qaTeam = new ArrayList<>();

		qaTeam.add(new Testuotojas(jira, 2 * SPEED));
		qaTeam.add(new Testuotojas(jira, 7 * SPEED));
		qaTeam.add(new Testuotojas(jira, 1 * SPEED));
		qaTeam.add(new Testuotojas(jira, 3 * SPEED));
		qaTeam.add(new Testuotojas(jira, 2 * SPEED));
		qaTeam.add(new Testuotojas(jira, 3 * SPEED));

		for (Testuotojas testuotojas : qaTeam) {
			testuotojas.start();
		}

		List<Developeris> devTeam = new ArrayList<>();

		devTeam.add(new Developeris(jira, 2 * SPEED));
		devTeam.add(new Developeris(jira, 3 * SPEED));
		devTeam.add(new Developeris(jira, 4 * SPEED));
		devTeam.add(new Developeris(jira, 1 * SPEED));
		devTeam.add(new Developeris(jira, 2 * SPEED));
		devTeam.add(new Developeris(jira, 2 * SPEED));

		for (Developeris developeris : devTeam) {
			developeris.start();
		}

		PM pm = new PM(jira, 1000, devTeam);
		pm.start();

		System.out.println("Sukurem UAB... sekmes versle... :) ");

	}

}
