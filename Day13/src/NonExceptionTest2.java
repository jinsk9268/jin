
public class NonExceptionTest2 {

	public static void main(String[] args) {

		int i = 10;
		double sum = 0;
		
		try {
		sum = i/0;
		} catch(ArithmeticException e) { // Exception e도 가능
			System.out.println("error : " + e.getMessage());
		}
		
		System.out.println("sum = " + sum);

	}

}
