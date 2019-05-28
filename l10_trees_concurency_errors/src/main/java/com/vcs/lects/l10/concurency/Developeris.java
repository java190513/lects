package com.vcs.lects.l10.concurency;

public class Developeris extends Thread{
	
	private Jira jira;
	private int kiekUztrunka = 0;
	private boolean dirba = false;
	
	public Developeris(Jira jira, int kiekUztrunka) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
	}

	public boolean isDirba() {
		return dirba;
	}
	
	public void kodina() {
		
		try {
			Thread.sleep(kiekUztrunka);
			dirba = jira.atsidaroIrSprendzia();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {

		while (true) {
			kodina();
		}
	}
	
	

}
