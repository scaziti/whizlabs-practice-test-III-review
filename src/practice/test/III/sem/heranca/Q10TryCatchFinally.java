package practice.test.III.sem.heranca;

public class Q10TryCatchFinally {
	public static void main(String[] args) throws Exception {
		try {
			
			System.out.println("try started");
			throw new Exception();
			
		} catch (Exception e) {
			throw e;
			
		} finally {
			
			System.out.println("Finally Completed");
			
		}
		
		//output: try started finally Completed seguido de uma exception
	}

}
