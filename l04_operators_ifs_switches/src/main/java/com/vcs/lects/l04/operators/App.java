package com.vcs.lects.l04.operators;

public class App {

	public static void main(String[] args) {
		Operators op = new Operators();
		op.mathExample();
		op.mathExample();
		
		Palyginimo pal = new Palyginimo();
		System.out.println( pal.arTenkinaSalyga(4, 6) );
		System.out.println( pal.arTenkinaSalyga(6, 4) );
		
	}

}
