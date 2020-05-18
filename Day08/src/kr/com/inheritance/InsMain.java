package kr.com.inheritance;

/**
 * call by reference (파라미터 값 태울때 본인의 주소값을 넘기므로 파라미터와 원본이 바라보는 값이 같음, 그 자체를 넘김, 원본에 문제 있음)
 * call by value (값만 복사해서 줬으므로 원본에는 문제 없음) 
 * 
 * static 예제
 * @author PC
 *
 */

public class InsMain {
	
	/**
	 * 정적메서드 선언
	 * static 을 붙이면 정적 메서드 또는 변수가 된다
	 * static 메서드 또는 변수는 클래스가 컴파일 되는 시점에서
	 * 메모리가 올라가기때문에
	 * 클래스의 객체화 전에 사용 가능하다
	 */
	
	public static void modifyStudent(Students sp) {
		int age = sp.getAge() +1;
		sp.setAge(age);
		System.out.println("함수 호출 학생 나이 : " + sp.getAge());
	}
	
	public static void addValue(int value) {
		value = value +1;
		System.out.println("함수 호출 : " + value);
	}

	public static void main(String[] args) {
		
		//Person sp = new Students("홍길동", "남자", 100, "졸업반", 90, 90, 90);
		//((Students)sp).
		
		int num = 10;
		Students sp = new Students("홍길동", "남자", 100, "졸업반", 90, 90, 90);
		
		InsMain.addValue(num);
		System.out.println("함수 호출 후 : " +num);
		
		InsMain.modifyStudent(sp);
		System.out.println("함수 호출 후 학생 나이 : " + sp.getAge());

	}

}
