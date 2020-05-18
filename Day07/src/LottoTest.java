import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		
		// 사용자 로또
		int[] user = new int[6];
		// 컴퓨터 로또
		int[] com = new int[6];
		// 보너스 번호
		int bonusNum = 0;
		// 로또의 값을 저장할 임시변수
		int tempVal = 0;
		// 논리형 변수 boolean
		boolean isExist = false;
		// 입력을 받기 위한  scanner
		Scanner scan = new Scanner(System.in);
		
		int loopCount = 0; // 한번도 안돔
		
		// 컴퓨터 로또를 만들자 이유는 모르면 못맞출걸?
		while(loopCount <= 6) {
			
			tempVal = (int)(Math.random() * 45) +1;
			//처음 시작은 비교할 필요가 없어요
			if(loopCount ==0) {
				com[loopCount++] = tempVal; // 0 집어넣고 증가하라고 loopCount++
			} else {
				//중복검사
				for (int i = 0; i <loopCount; i++) { // 들어있는 값까지만 비교하면 되므로
					if(com[i] == tempVal) {
						isExist = true;
						break; // 같으면 비교할 필요가 없으니까
					}
				} // end 중복검사
				
				if(!isExist) {
					
					if(loopCount == 6) {
						bonusNum = tempVal;
						break; // while 문 종료
					} else {
					com[loopCount++] = tempVal;
					}
				} else {
					//다음 검사를 위해 초기화
					isExist = false;
				}
			}
		} // comp while 종료
		
		// 컴퓨터 로또 확인
		Arrays.sort(com); // 오름차순 정렬
		System.out.println(Arrays.toString(com) +", "+bonusNum);
		
		// 사용자 로또를 만들자
		loopCount = 0; // 재활용을 위한 초기화
		while(loopCount < 6) { // 보너스 번호 없으니까	
			System.out.println("(1~45) 숫자를 입력 : ");
			tempVal = scan.nextInt(); // 숫자형 키보드 값 입력받기
			
			// 유효 숫자값 판별
			if(tempVal <= 0 || tempVal > 45) {
				System.out.println("1~45 사이 숫자만 입력가능");
				continue;
			}
			
			// 처음이면 그냥 넣자
			if(loopCount ==0 ) {
				user[loopCount++] = tempVal;
			} else {
				//중복검사
				for (int i = 0; i <loopCount; i++) { // 들어있는 값까지만 비교하면 되므로
					if(user[i] == tempVal) {
						isExist = true;
						break; // 같으면 비교할 필요가 없으니까
					} 
				}// end 중복검사
					
					if(!isExist) {
						user[loopCount++] = tempVal;
					} else {
						//다음 검사를 위해 초기화
						isExist = false;
					} 
				} 
		} // user while 종료
			
			Arrays.sort(user); // 오름차순 정렬
			System.out.println(Arrays.toString(user));
			
			// 두 배열의 비교
			int isCorrect = 0; // 맞은 개수
			int bonusCount = 0; // 보너스 숫자
			
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if(bonusCount == 0) {
						if(user[i] == bonusNum) {
							bonusCount++;
						}
					}
					
					if (user[i] == com[j]) {
						isCorrect++;
						// 보너스 번호찾기전에는 loop가 다 돌아야 한다
						if(bonusCount > 0) {
							break;
						}
						
					}
				}
			
		} // 비교 loop 종료
		
			if(isCorrect == 6) {
				System.out.println("1등!! 축하합니다!!");
			} else if (isCorrect == 5 && bonusCount == 1) {
				System.out.println("2등!! 축하합니다!!");
			} else if (isCorrect == 5 && bonusCount == 0) {
				System.out.println("3등!! 축하합니다!!");
			} else if (isCorrect == 4) {
				System.out.println("4등!! 축하합니다!!");
			} else if (isCorrect == 3) {
				System.out.println("5등!! 축하합니다!!");
			} else {
				System.out.println("탈락입니다");
			}
			
			//jdk 1.7부터 닫아줘야함
			scan.close();
	}

}
