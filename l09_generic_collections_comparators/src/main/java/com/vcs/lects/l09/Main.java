package com.vcs.lects.l09;

public class Main {

	public static void main(String[] args) {

		// Rikuoti turi kaip skaicius, ne kaip string’us
		String[] strs = { "100", "10", "1", "099" };

		// Ir didejancia ir mazejancia tvarka rikuoti
		Double[] dbls = { 3.14, 60.0, 1.46 };

		// Rodyt turi varda, bet rikuoti pagal eil nr.
		Person[] prsns = { new Person("Ona", 7), new Person("Jonas", 13), new Person("Vardene", 2), };

		StrConverter strConv = new StrConverter() {

			@Override
			public String toCustomString(Object obj) {
				return ((Person) obj).getVardas();
			}
		};

		StrConverter strConvToString = new StrConverter() {

			@Override
			public String toCustomString(Object obj) {
				return obj.toString();
			}
		};

		System.out.println(ToStrUtil.toStr(", ", strConv, prsns));

		System.out.println(ToStrUtil.toStr(", ", strConvToString, strs));

	}

}
