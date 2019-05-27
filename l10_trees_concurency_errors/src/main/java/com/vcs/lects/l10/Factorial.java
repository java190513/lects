package com.vcs.lects.l10;

public class Factorial {
	
	
	
	public static void main(String[] args) {
		
		Factorial f= new Factorial();
		System.out.println( f.fact(5) );
	}
	
	
	public int fact(int number) {
		
		if (number > 1) {
			return number * fact(number - 1);
		}
		
		return 1;
	}
	
	

}
