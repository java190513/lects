package com.vcs.lects.l10.concurency;

public class Testuotojas extends Thread {
	private Jira jira;
	private int kiekUztrunka = 0;

	public Testuotojas(Jira jira, int kiekUztrunka) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
	}

	public void kuriaNaujusReikalavimus() {

		try {
			Thread.sleep(kiekUztrunka);
			jira.sukuriaDefekta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		while (true) {
			kuriaNaujusReikalavimus();
		}
	}

}
