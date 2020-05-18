package kr.code.wrapper;

public class WrapperTest01 {

	public static void main(String[] args) {
		
		/**
		 * wrapper 클래스의 autoBoxing 기능.
		 * wrapper 클래스 : 기본형 타입의 변수를 클래스로
		 * autoBoxing 대표적인 예 : String (기본형 타입의 변수가 없으므로 wrapper 클래스는 아니다)
		 * 값을 클래스 타입 변수에 그대로 대입하여 삽입할 수 있게된다.
		 * 데이터 베이스에서 데이터 퍼올때 변수를 클래스로 만드는게 좋다 (데이터베이스의 데이터 클래스형이기 때문)?
		 */
		
		Integer a = 3;
		Integer b = new Integer(3);
		
		/**
		 * a의 3과 b의 3은 위치가 다르다
		 * 
		 * a ------------> 3 (x0x01)
		 * b ------------> 3 (x001x1)
		 * 
		 * b는 선언할때 new 키워드로 새로운 메모리 공간을 만들고
		 * 객체로서 3을 넣었기 때문에 서로 바라보는 주소가 다름
		 */
		
		System.out.println(a == b);
		
		/**
		 * b의 값을 intValue(); 라는 메서드를 사용하여 출력
		 * a와 b의 value 비교이기 때문에  true
		 */
		
		System.out.println(a == b.intValue()); // intValue() 비추

	}

}
