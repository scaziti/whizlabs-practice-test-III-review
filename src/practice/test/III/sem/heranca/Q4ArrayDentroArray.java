package practice.test.III.sem.heranca;

public class Q4ArrayDentroArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][];
		a[1] = new int[] {1,2,3};
		a[2] = new int[] {4,5};
		System.out.println(a[1][2]);
		
		// output: 3
		
		/*
		 * Note que na linha 1 do array a, insiro um array de tamanho 3 (1,2,3) 
		 * Na linha 2, insiro um array tamanho 2 (4,5)
		 * Dessa forma, ao printar a posição a[1][2]: 3
		 */
	}
}
