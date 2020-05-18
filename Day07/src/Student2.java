import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student2 {
	
	private String name;
	private String gender;
	private int age;
	private int kor;
	private int eng;
	private int math;
	
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

}
