package practice.test.III.sem.heranca;

import java.util.Arrays;

public class Q5NullPointerException {

	public static void main(String[] args) {
		int[][] ints = new int[2][];
		
		Arrays.sort(ints[1]);
		
		System.out.println(Arrays.toString(ints[1]));
		
		
		// Output: NullPointerException, pois crio o array, mas sem valores!
		
		/*
		 * se iniciar o array inteiro, por exemplo new int[2][2], o valor default será 0, não null
		 * dessa forma imprimiria vários zeros, ao invés do erro
		 * 
		 */
	}
}
