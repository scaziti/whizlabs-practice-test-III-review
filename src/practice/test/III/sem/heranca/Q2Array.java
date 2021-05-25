package practice.test.III.sem.heranca;

public class Q2Array {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,4}, {5,2,1}, {0,43,2}};
		int b[] = a[2];
		System.out.println(b[1]);
		
		//Output: 43
		
		/*
		 * isso ocorre, pois estou jogando toda linha 2 (0,43,2) no array b
		 * quando imprimo b[1] = 43
		 */
	}
}
