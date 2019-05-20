package com.vcs.lects.l06.references;

public class Ref {

	public static void main(String... strings) {

		Integer abc1 = 0;
		int abc2 = 10;
		Integer abc3 = null;
		Integer abc4 = null;

		abc3 = abc4;
		abc4 = 5;
		abc3 = abc2;
		abc2 = abc1;
		abc1 = abc3;

		System.out.println(abc1); // ?
		System.out.println(abc2); // ?
		System.out.println(abc3); // ?
		System.out.println(abc4); // ?

		Ref r = new Ref();
		r.user();

	}

	private void user() {

		ConnResult cr = new ConnResult();
		if (connect(cr)) {
			System.out.println(cr.getOk());
		} else {
			System.err.println(cr.getError());
		}

	}

	private boolean connect(ConnResult result) {

		result.setOk("PostgreDB 9.1v 234234");
		return false;

	}

}

class ConnResult {
	private String ok = null;
	private String error = null;

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
