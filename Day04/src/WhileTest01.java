import java.util.Scanner;

public class WhileTest01 {
	
	public static void main(String[] args) {
		
		/**
		 * 키보드 입력을 받기 위한 ... Scanner.
		 */
		Scanner scan = new Scanner(System.in); // ctrl + shift + o ->import java.util.Scanner;
		int correctNum = 0; // 업& 다운 정답값
		int userInput = 0; // 사용자 입력값.
		
		int count = 0; // 실행횟수.
		
		correctNum = (int)(Math.random() * 50) + 1; // 1 ~ 50사이의 랜덤값/ 랜덤값으로 0.0~50.0 (50보다는 작은수) int형 소수점 버리므로 0.0이나 49.99일때 49니까 +1해주기
		while(true) { //무한루프
			
			System.out.println("숫자를 맞춰보세요 ? :");
			userInput = scan.nextInt(); //int형 정수만 키보드 입력받겠다
			
			if(count < 10 ) { //10번만 돌리겠다
				
				if(userInput == correctNum) {
					System.out.println("정답입니다! ");
					break; // 강제종료 (맞추면 아래꺼 할필요가 없으니까)
				} else if (userInput > correctNum) {
					System.out.println("down ");
					count++; // 틀렸으니 회수 증가
				} else {
					System.out.println("up!");
					count++;
				}
				
			}else { // 횟수가 10 초과하면 종료
				System.out.println("패했습니다 정답은 : " + correctNum);
				break; //무한반복이기 때문에 어디선가 종료를 시켜줘야되니까
			}
		}
		
	}
	
}
