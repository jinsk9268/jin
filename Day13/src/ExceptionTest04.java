
public class ExceptionTest04 {
	
	public static int divide(int x, int y) throws Exception {
		int result = 0;
		
		if (y==0) {
			throw new ArithmeticException("can not divide by Zero"); //객체 선언, 에레메서지 선언하는 매개변수
		}
		
		return result;
	}
	
	public static void main(String[] args) { //throws 메인에서 던질수있으나 처리 꼭 해줘야됨
		int a = 30;
		int b = 0;
		int sum = 0;
		
		try { //자기가 내는
			
		sum = divide(a, b); // divide라는 메서드에 던져서 
		
		} catch (Exception e) {
			
			System.out.println("error : " + e.getMessage());
			
		}
		System.out.println(sum);
	}
	
}
