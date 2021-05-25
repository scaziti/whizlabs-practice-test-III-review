package practice.test.III.sem.heranca;

public class Q37 {
	public static void main(String[] args) {
		
		final int i = 0;
		final int j;
		j = 2;
		
		int x = (int)(Math.random()*3);
		
		switch(x) {
			case i:{
				System.out.println("A");
			}
			case 1: 
				System.out.println("B");
				break;
			case j:
				System.out.println("C");
		}
	}
	
	// Não compila, pois para utilizar no switch, preciso obrigatoriamente ter declarado na mesma linha
	// o valor de j

}
