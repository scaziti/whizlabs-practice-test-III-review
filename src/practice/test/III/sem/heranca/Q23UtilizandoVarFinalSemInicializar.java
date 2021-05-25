package practice.test.III.sem.heranca;

public class Q23UtilizandoVarFinalSemInicializar {
	
	final int i;
	
	public static void main(String[] args) {
		
		Q23UtilizandoVarFinalSemInicializar s = new Q23UtilizandoVarFinalSemInicializar();
		System.out.println("i = " + s.i);
	}

	// Compile-time error (nem compila!!)
	
	/*
	 * Preciso declarar o valor de uma variável final!!!
	 */
}
