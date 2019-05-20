package com.vcs.lects.l06.bank.eaxample;

public class BankWaitingArea {

	public static void main(String[] args) {

		TicketMashine tm1 = new TicketMashine();
		TicketMashine tm2 = new TicketMashine();
		TicketMashine tm3 = new TicketMashine();

		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm2.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm2.printTheTicket().getNumber());
		
		System.out.println(tm3.printTheTicket().getNumber());
		
		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm2.printTheTicket().getNumber());
		System.out.println(tm2.printTheTicket().getNumber());

	}

}
