package practice.test.III.sem.heranca;

public class Q26LacoComContinue {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		
		for (int j : a) {
			if (j == 2) continue;
			for (int x = 0; x < 3; System.out.print(x)) {
				x++;
			}
		}
	}
	
	// Output: 123123123
	
	/*
	 * Quando j valer 2, o for não será executado, dessa forma, ao invés de sair:
	 * 123123123123 (4x), sairá apenas 3x nas interações do array com valores de 1,3,4
	 */

}
