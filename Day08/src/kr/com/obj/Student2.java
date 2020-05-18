package kr.com.obj;
import java.math.BigDecimal; // java.math. : 패키지명 , BigDecimal : 클래스명, 패키지명+클래스명 = 자바의 풀네임
import java.math.RoundingMode;

public class Student2 {
	
	private String name;
	private String gender;
	private int age;
	private int kor;
	private int eng;
	private int math;
	
	/**
	 * 생성자  over load
	 * 생성자를 통한 데이터 주입
	 * */
	public Student2(String name, String gender, int age, int kor, int eng, int math) {
		//생성자에 파라미터를 추가
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setKor(kor);
		this.setMath(math);
		this.setEng(eng);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 총점 계산하기
	public int getTotal() {
		return (this.getKor() + this.getEng() + this.getMath());
	}
	
	public double getAvg() {
		//자바에서 소수점 계산 정확하게할때 BigDecimal 사용
		return new BigDecimal( (double)getTotal() / 3).setScale(2, RoundingMode.HALF_UP).doubleValue(); 
		// BigDecimal 생성자(method)
		// setScale 소수점의 범위를 정하겠다
		// RoundingMode : class (static)
		// HALF_UP 상수값
		// doubleValue로 출력하겠다
	}

	//source- override 클릭해서
	//@Override // override , overload 는 지워도됨
	public String toString() {
		String result ="";
		result += "이름:"+this.getName() +" 성별:"+this.getGender() +" 나이:"+this.getAge()
					+" 국어:"+this.getKor() +" 영어:"+this.getEng() +" 수학 :"+this.getMath()
					+" 총점:"+this.getTotal() +" 평균"+this.getAvg();
		return result;
	}

}
