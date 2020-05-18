
public class StudentMain {

	public static void main(String[] args) {
		
		// 학생 클래스 선언
		/**
		 * 클래스명 지시자 = new 생성자();
		 */
		Student2 st = new Student2(); // 나중에 앞글자 대문자로
		
		//setter를 통한 데이터 주입
		st.setName("홍길동");
		st.setAge(100);
		st.setGender("남자");
		st.setKor(90);
		st.setEng(10);
		st.setMath(100);
		
		//데이터 출력
		System.out.println("이름 : " + st.getName() +", 나이 :" + st.getAge() +"살, 총점 : "+ st.getTotal() + "점, 평균 : "+ st.getAvg()+ "점");

	}

}
