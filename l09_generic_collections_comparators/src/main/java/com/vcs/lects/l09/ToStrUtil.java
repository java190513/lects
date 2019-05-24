package com.vcs.lects.l09;

public class ToStrUtil {

	public static String toStr(String sep, StrConverter strConv, Object... objs) {

		// Arrays.sort(objs);

		String result = "";
		for (Object obj : objs) {
			result += strConv.toCustomString(obj) + sep;
		}

		return result;
	}

}
