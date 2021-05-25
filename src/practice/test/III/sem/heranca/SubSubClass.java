package practice.test.III.sem.heranca;

class MainClass{
	MainClass(){
		System.out.print("Main Class " );
	}
}


class SubClass extends MainClass{
	
	{System.out.print("I ");}
	
	static {
		System.out.print("S ");
	}
	
	SubClass(int i){
		this();
		System.out.print("SubClass");
	}
	
	SubClass(){
		super();
		System.out.print("SubClass ");
	}
}

public class SubSubClass extends SubClass{

	SubSubClass(String s){
//		super();
		System.out.print("SubSubClass ");
	}
	
	public static void main(String[] args) {
		
		new SubSubClass("ABC");
	}
}

// Output: S Main ClassI SubClass SubSubClass 

/*
 * Ao criar o objeto SubSubClass, será invocado o super (subClass).
 * Quando isso é feito, o block de inicialização static é chamado uma vez: S
 * Depois o construtor da classe mãe: Main Class
 * O block de instancia é chamdo antes do construtor da mesma class: I
 * então é printado a informação do construtor: SubClass
 * por fim: SubSubClass
 * 
 * Se eu tivesse criado mais um objeto da SubSubClass, seria printado tudo igual, com exceção 
 * da letra S (pois o bloco static só roda uma vez)
 */


