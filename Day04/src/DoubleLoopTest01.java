
public class DoubleLoopTest01 {

	public static void main(String[] args) {
		
		/**
		 * 이중 포문을 이용한 구구단
		 */
		/*
		for (int i = 2; i < 10; i++) { // 2~9까지
			
			for (int j = 1; j < 10; j++) { // 1~9까지 , j가 끝날때 까지 i는 고정값
				System.out.print(i+"x"+j +"= " +(i*j)+"\t"); //문자열 + 숫자 = 문자, 연산자 우선순위에 따라서 계산해줘야하므로 (i*j) 꼭 묶어주기
			}
			System.out.println(); // j가 끝난후 다시 i시작할때 줄바꿈
		}
		*/
		/*
		for (int i = 1; i < 10; i++) { // 2~9까지
			
			for (int j = 2; j < 9; j++) { // 1~9까지 , j가 끝날때 까지 i는 고정값
				System.out.print(j+"x"+i +"= " +(j*i)+"\t"); //문자열 + 숫자 = 문자, 연산자 우선순위에 따라서 계산해줘야하므로 (i*j) 꼭 묶어주기
			}
			System.out.println(); // j가 끝난후 다시 i시작할때 줄바꿈
		}
		*/
		for (int i = 2; i < 10; i++) { // 2~9까지
			
			for (int j = 1; j < 10; j++) { // 1~9까지 , j가 끝날때 까지 i는 고정값
				System.out.print(j+"x"+i +"= " +(i*j)+"\t"); //문자열 + 숫자 = 문자, 연산자 우선순위에 따라서 계산해줘야하므로 (i*j) 꼭 묶어주기
			}
			System.out.println(); // j가 끝난후 다시 i시작할때 줄바꿈
		}
	}

}
