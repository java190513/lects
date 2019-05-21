package com.vcs.lects.l06.references;

public class Equaling {
	
	
	public static void main(String[] args) {
		
		Equaling eq = new Equaling();
		System.out.println(eq.isItAbc(null));
		
		System.out.println(eq.isIt5(null));
	}
	

	boolean isItAbc(String s1) {
		
		return "abc".equals(s1);

	}

	boolean isIt5(Integer sk) {
		return ((Integer)5).equals(sk);
	}

}
