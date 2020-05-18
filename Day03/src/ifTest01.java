
public class ifTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 랜덤함수
		 * 범위내에 값을 랜덤하게 출력해주는 기능
		 * Math.random() Math라는 class안에 random이란 함수 사용
		 */

		int random = 0;
		
		// 1~100 사이에 숫자 중 랜덤하게 출력됨.
		random = 60 + ((int)(Math.random() * 40) +1); // 실수형을 int형으로 바꾸면 소수점 버림, 100이 맥시멈값, 최소가 60
		
		if( random == 100 ) {
			System.out.println("만점!!");
			
		} else if (random >=90 && random < 100) { //위에 조건과 안겹치게 할려고 미만, && 두가지 조건이 모두 참이어야 참
			System.out.println("점수는 A");
			
		} else if (random >=80 && random < 90) {
			System.out.println("점수는 B");
			
		} else if (random >=70 && random < 80) {
			System.out.println("점수는 C");
			
		} else {
			System.out.println("점수는 F");
		}
	}

}
