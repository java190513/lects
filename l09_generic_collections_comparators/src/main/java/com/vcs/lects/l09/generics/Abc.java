package com.vcs.lects.l09.generics;

public class Abc<T> {
	private T data;

	public Abc(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
}
