package kr.com.obj;

import java.util.Scanner;

public class StdService {

	private Student2[] stArray = new Student2[3];
	private Scanner scan = new Scanner(System.in);
	private int stdCount = 0;
	
	//시작메써드
	public void start() {
		
		int menuNum = 0;
		
		while(true) {
			
			System.out.println("1.학생등록         2. 학생 출력      3.종료");
			menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1:
				insertStd();
				break;
			case 2:
				printStd();
				break;
			case 3:
				//프로그램 종료
				System.exit(0);
				break;
			default:
				System.out.println("해당 메뉴가 없습니다.");
			}
		}
		
	}
	
	public void insertStd() {
		String name = null;
		String gender = null;
		int age = 0;
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		if(stdCount == 3) {
			System.out.println("더이상 학생 추가 불가");
		} else {
			
			/**
			 * 스캐너에서 문자열을 받는건
			 * next()와 nextline()가 있다
			 * 차이는 띄어쓰기 가능 유무 - next()가 띄어쓰기가 안된다
			 * 다만,
			 * nextline() 기존에 있던 key buffer 를 날리기 때문에
			 * 쓰기 이전에 키 입력(엔터...스페이스바)가 있다면 정상동작 안할 수 있다.
			 * 그래서 nextline() 이전에
			 * 키보드 입력이 있었다면.....앞에 버퍼를 비우기 위한
			 * 의미없는 nextline()을 한번 실행한 뒤 써야 한다
			 */
			
			//정보 저장
			System.out.println("학생 이름 : ");
			name = scan.next(); // scan.next() 문자열 받기
			// 추가로 scan.nextline()->이전에 입력했던 key buffer가 남아있다면 출력하여서
			// 문장입력이 제대로 안될 수 있음
			// scan.nextline(); -> 버퍼날라기용
			System.out.println("학생 성별 : ");
			gender = scan.next();
			System.out.println("학생 나이 : ");
			age = scan.nextInt();
			System.out.println("국어 점수 : ");
			kor = scan.nextInt();
			System.out.println("수학 점수 : ");
			math = scan.nextInt();
			System.out.println("영어 점수 : ");
			eng = scan.nextInt();
			
			//학생 배열에 객체 넣기
			stArray[stdCount++] = new Student2(name, gender, age, kor, eng, math);
			
			System.out.println("학생이 등록 되었습니다.");
		}
		
	}
	
	public void printStd() {
		
		if(stdCount==0) {
			System.out.println("등록된 학생이 없습니다.");
		} else {
			
			//클래스에 toString이 구현되어 있으므로 그냥 클래스 출력
			for (int i = 0; i < stdCount; i++) {
				System.out.println(stArray[i]);
			}
		}
	}
	
}
