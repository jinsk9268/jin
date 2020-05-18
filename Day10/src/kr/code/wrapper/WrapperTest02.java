package kr.code.wrapper;

public class WrapperTest02 {

	public static void main(String[] args) {
		
		String strNum = "3540";
		String strNum2 = "350.44"; // 바꿀때 Double형으로 바꾸기 소수점 있기때문
		double sumValue = 0;
		
		sumValue = Integer.parseInt(strNum) + Double.parseDouble(strNum2);
		
		/**
		 * 숫자가 문자타입으로 되어있는 경우, 소수점이 있다면
		 * 정수형타입으로 변환은 불가능
		 * 정수형타입변환 메서드가 소수점(.) 을 문자로 인식하기때문에 오류가 난다.
		 * 그래서 정수형으로 변환하려면 우선 double --> int로 치환해줘야하는 번거로움은 존재
		 */
		
		//sumValue = Integer.parseInt(strNum2) + Double.parseDouble(strNum2);
		
		System.out.println("sum > " + sumValue);
		
		// compare 함수 : 앞이 크면 1, 뒤가 크면 -1
		System.out.println(Integer.compare(30, 100));

	}

}
