package com.vcs.lects.l07.tasks;

public class Relations {

}


class Zmogus extends Object {
	
	private Suo[] sunys;
	private Pilietybe[] pilietybes;
	private Plaukai plaukai;
	
}

class Vaikas extends Zmogus {}
class Suauges extends Zmogus {}

class Moteris extends Suauges {}
class Vyras extends Suauges {}

class Motina extends Moteris{}
class Tevas extends Vyras{}

class Suo {
	private Plaukai plaukai;
	
}
class Pilietybe {}
class Plaukai {}
