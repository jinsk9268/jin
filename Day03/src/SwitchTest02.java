
public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		// 1 ~ 100까지 최저 50부터
		num = 50 + (int)(Math.random() * 50) +1; // 최저 50부터 100까지
		
		/**
		 * switch(조건대상) {.... , 범위조건식처럼 주고싶으면 그렇게 결과를 줘야됨 , 조건대상을 잘줘야됨
		 * case 조건식 들어가면 안됨, 단순해야, 단일조건이어야함, 단순한 조건일때 많이씀, 간단한 명령에 대한 기능의 분기를 태울때 사용
		 * 제약조건도 간단, 실행문도 간단해야함
		 */
		
		switch((num/10)) {
		case 10: // 몫이 10이면 100점이니까 만점
			System.out.println("만점!!");
			break;
		case 9: // 몫이 9이면 90점대이니까 A
			System.out.println("A");
			break;
		case 8: // 조건식 들어가면 안됨, 단순해야, 단일조건이어야함, 단순한 조건일때 많이씀, 간단한 명령에 대한 기능의 분기를 태울때 사용
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}

	}

}
