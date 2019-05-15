package com.vcs.lects.l02.naujas;

import com.vcs.lects.l02.ManoKlase;



/**
 * 
 * 
 * 
 * 
 * @author Paulius <a href="">email@email.email</a>
 *
 */
public class Pirma {

	/**
	 * Pavizdys kaip nerasyti kodo arba
	 * 
	 * <pre>
	 * NullPointerException
	 * null value
	 * </pre>
	 * 
	 * exampl'as. Nauja eilute
	 * 
	 * @param args - konsoles argumentai
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * 
		 * */

		Pirma p = null;

		if (args.length > 1) {
		}

		p.name();

	}

	public void name() {

		int sk = 5;

		sk = 6;
		sk = 10;
		sk = -3242;

		ManoKlase mk = new ManoKlase();
		mk.isvedimas();

		mk.isvedimas();
		mk.isvedimas();
		mk.isvedimas();
		mk.isvedimas();

		mk.isvedimas();
		mk.isvedimas();
		mk.isvedimas();
		mk.isvedimas();

		mk = new ManoKlase();

	}

}
