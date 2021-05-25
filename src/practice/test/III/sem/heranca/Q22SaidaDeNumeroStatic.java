package practice.test.III.sem.heranca;

public class Q22SaidaDeNumeroStatic {
	
	static int i;
	int j;
	
	Q22SaidaDeNumeroStatic() {
		j = i++;
	}
	
	public static void main(String[] args) {
		
		Q22SaidaDeNumeroStatic s = new Q22SaidaDeNumeroStatic();
		Q22SaidaDeNumeroStatic s1 = new Q22SaidaDeNumeroStatic();
		Q22SaidaDeNumeroStatic s2 = new Q22SaidaDeNumeroStatic();
		
		System.out.print("i =" + s.i);
		System.out.println(", j = " + s.j);
		
		// Output: i =3, j = 0
		
		/*
		 * Quando crio s, i vale 0. Dessa forma, j = 0;
		 * Por ser static, toda vez que crio novos objetos, i recebe ele + 1;
		 * Como criei 3 objetos, i passa a valer 3 
		 * e j com a referência de s, valerá apenas 0
		 * s1: j = 1
		 * s2: j = 2
		 *
		 */
		
	}

}
