package com.vcs.lects.l09.generics;

import com.vcs.lects.l09.Person;

public class GenericMain {

	public static void main(String[] args) {

		
		Abc<String> abcStr = new Abc<>("");
		
		Abc<Person> abcPrs = new Abc<>(new Person("sadfs", 435));
		
		Abc<String> abcStr2 = new Abc<>("safsdf");
		
		abcStr = abcStr2;
		
		
	}

}
