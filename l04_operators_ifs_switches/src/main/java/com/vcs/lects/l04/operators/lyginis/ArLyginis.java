package com.vcs.lects.l04.operators.lyginis;

public class ArLyginis {

	public boolean arLyginis(int sk) {
		return sk % 2 == 0;
	}

	public boolean arNelyginis_1(int sk) {
		return sk % 2 != 0;
	}
	
	public boolean arNelyginis_2(int sk) {
		return sk % 2 == 1;
	}
	
	public boolean arNelyginis_3(int sk) {
		return !arLyginis(sk);
	}

}
