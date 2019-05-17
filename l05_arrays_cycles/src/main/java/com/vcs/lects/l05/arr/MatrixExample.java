package com.vcs.lects.l05.arr;

public class MatrixExample {

	public static void main(String[] args) {

		MatrixExample me = new MatrixExample();
		System.out.println(me.ilgioIrasymas());

	}

	private int ilgioIrasymas() {

		int[][] abc = { { 99999 }, { 3, 4, 5 }, { 5, 6, 7, 8, 9 }, { 864 } };

		abc[abc.length - 1][abc[abc.length - 1].length - 1] = abc[0][0];

		return getLast(abc);

	}

	/**
	 * <pre>
	 * 
	 *matrix = {
	 * 		{1, 2},
	 * 		{3, 4},
	 * 		{5, 6}
	 * 	}
	 * matrix.length - 1; // 2
	 * matrix[0].length - 1 //1
	 * 
	 * 
	 * 
	 *  matrix = {
	 * 		{1},
	 * 		{3, 4, 5},
	 * 		{5, 6, 7, 8, 9}
	 * 	}
	 * matrix.length - 1; // 2
	 * matrix[ matrix.length - 1 ].length - 1 // 4
	 * 
	 * 
	 * 
	 * </pre>
	 * 
	 */
	public int getLast(int[][] matrix) {

		int kaiStaciakampes = matrix[matrix.length - 1][matrix[0].length - 1];

		int kaiBetkokieMatmenys = matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1];

		return kaiBetkokieMatmenys;
	}

}
