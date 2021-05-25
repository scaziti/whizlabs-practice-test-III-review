package practice.test.III.sem.heranca;

public class Q15Shadowing {
	
	int a = 10;
	
	public static void main(String[] args) {
		
		new Q15Shadowing().print();
	}
	
	public void print() {
		int a = 8;
		System.out.println(a + " ");
	}

	// Output: 8
	
	/*
	 * 
	 * Note que crio uma nova vari�vel com o mesmo nome da vari�vel de instancia
	 * Dessa forma, ao printar, estou printando apenas a vari�vel local
	 */
}
