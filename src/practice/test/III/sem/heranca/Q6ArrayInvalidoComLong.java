package practice.test.III.sem.heranca;

public class Q6ArrayInvalidoComLong {

	public static void main(String[] args) {
		
		long size = 0xB; //legal! Vale 11, pois � hexadecimal (0x ou 0X)
		
		// N�o compilar�, pois estou passando um long sem cast expl�cito
		// Daria certo mudando o size para o tipo int
		int[] ints = new int[size];
		
		ints [5] = 10;
		
		System.out.println(ints[5] + 10);
	}
}
