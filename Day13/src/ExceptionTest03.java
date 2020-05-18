
public class ExceptionTest03 {
	
	public static int divide(int x, int y) throws Exception{
		//메서드에 throws Exception 안던져도 오류는 안남
		//예외 던질때는 Exception으로 던지는게 좋음, 어떤 오류가 날지 모르니까
		int result = x/y;
		
		return result;
	}
	
	public static void main(String[] args) { //throws 메인에서 던질수있으나 처리 꼭 해줘야됨
		int a = 30;
		int b = 0;
		int sum = 0;
		
		try {
			
		sum = divide(a, b); // divide라는 메서드에 던져서 
		
		} catch (Exception e) {
			
			System.out.println("error : " + e.getMessage());
			
		}
		System.out.println(sum);
	}
}
