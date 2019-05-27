package com.vcs.lects.l09;

import static com.vcs.lects.l09.ToStrUtil.toStr;

public class Main {

	public static void main(String[] args) {	

		System.out.println(toStr("abc", "aa"));
		
//		Integer.parseInt(s)
		
		System.out.println(toStr(",", ((o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2)), (o) -> o.toString(),  "16", "013"));

		System.out.println(toStr(15, 9, 0));

		System.out.println(toStr("; ", ((o1, o2) -> o1.getGimMetai() - o2.getGimMetai()), (o) -> o.getVardas(),
				new Person("A", 10), new Person("B", 9)));

	}

}
