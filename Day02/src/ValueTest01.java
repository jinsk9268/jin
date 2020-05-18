
public class ValueTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 선언
		int num01 = 10; // 선언방법 -> 변수타입 이름 = 값;
		// 실수형 변수 선언
		double dValue = 10.33d; // 뒤에 d 생략가능 , 기본형이라
		
		/*
		 * 자바는 실수의 기본형이 double 이라서
		 * float 값을 대입할 때는
		 * 오른쪽값이 float 타입이라고 명시해줘야하는데
		 * 방법 중 제일 쉬운 것은 뒤에 f를 붙여준다.
		 */
		
		// float fValue = 10.33f; // 자바는 기본적으로 더블이기때문에 float 쓸려면 숫자뒤에 f붙이기
		byte b= 30; // 정수형은 범위내 수가 들어가면 허용 (자기가 가지고있는 한계치를 설정)
		char c = 'A';
		int changeChar = 0;
		
		/**
		 * doucument 주석 / method에 대한 주석달때
		 */
		
		
		changeChar = c; // 문자를 정수타입에 대입 가능.
		// c = 99; 직접 대입 가능
		
		System.out.println("정수 출력 : " + num01);
		System.out.println("실수 출력 : " + dValue);
		System.out.println("문자 출력 : " + changeChar);
		System.out.println("문자 -> 숫자 : " + c + " ---> " + changeChar);
		
		// 자바에서 사칙연산할때 큰거랑 작은거 더하면 큰타입 가져온다 (ex: long인 15 int인 10 을 더하면 25이다 타입은 : long?? / byte + byte = int / long + byte = int)
		// 정수와 정수를 더하면 기본타입인 int (값이 int를 벗어나는 합이 도출되면 long로 바뀐다) / 정수와 실수를 더하면 실수값 
		// 나눗셈, 곱셈할때 실수값원하면 대상 실수로 바꿔주기

	}

}
