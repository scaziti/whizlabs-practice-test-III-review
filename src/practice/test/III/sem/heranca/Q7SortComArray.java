package practice.test.III.sem.heranca;

import java.util.Arrays;

public class Q7SortComArray {
	public static void main(String[] args) {
		
		int[] ints = {3,6,1,4,0};
		Arrays.sort(ints, 0, 4);
		for (int i : ints) {
			System.out.print(i);
		}
		
		// output: 12460
		
		/*
		 * Observe que o sorte começa na primeira posição (0) e vai até 4, deixando o último valor de fora
		 * Dessa forma, o sistema organiza as 4 primeiras posições, deixando zero onde está
		 */
	}

}
