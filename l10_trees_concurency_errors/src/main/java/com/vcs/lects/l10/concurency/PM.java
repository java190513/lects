package com.vcs.lects.l10.concurency;

import java.util.List;

public class PM extends Thread {

	private Jira jira;
	private int kiekUztrunka = 0;
	private List<Developeris> devsTeam;

	public PM(Jira jira, int kiekUztrunka, List<Developeris> devsTeam) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
		this.devsTeam = devsTeam;
	}

	public void teikiaAtaskaitasMums() {

		try {
			Thread.sleep(kiekUztrunka);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int tasks = jira.kiekDarbuDarLiko();
		int dirbantys = 0;
		int gyvi = 0;

		for (Developeris dev : devsTeam) {
			gyvi += dev.isAlive() ? 1 : 0;
			dirbantys += dev.isDirba() && dev.isAlive() ? 1 : 0;
		}

		boolean futboliukas = dirbantys < gyvi;

		System.out.println("Tasks: " + tasks + " dirba: " + dirbantys + " / " + devsTeam.size() + " "
				+ (futboliukas ? "futboliukas!" : ""));

	}

	@Override
	public void run() {

		while (true) {
			teikiaAtaskaitasMums();
		}
	}

}
