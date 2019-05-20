package com.vcs.lects.l06.bank.eaxample;

public class TicketMashine {

	private static int queue = 1;

	public Ticket printTheTicket() {

		return new Ticket(queue++);

	}

}
