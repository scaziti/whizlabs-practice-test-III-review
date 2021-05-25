package practice.test.III.sem.heranca;

public class Q25IndexOut {
	public static void main(String[] args) {
		
		new Q25IndexOut().iterator(new int[] {10,12,13});
	}
	
	void iterator(int[] i) {
		for (int x = 0; x < i.length; System.out.print(i[x] + " ")) x++;
	}

	// Output: 12 13 ArrayIndexOutOfBoundsException
	
	/*
	 * Perceba que o x valerá na 3 na terceira interação, dessa forma vai "estourar" o array
	 */
}
