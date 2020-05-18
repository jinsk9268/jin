package kr.com.inheritance;

//사람을 상속받음
public class Students extends Person{
	
	private String grade;
	private int kor;
	private int eng;
	private int math;
	
	//모든 클래스는 객체화를해야 쓸 수 있음
	//오류 : Implicit super constructor Person() is undefined. Must explicitly invoke another constructor
	//상위클래스의 생성자를 호출 해라
	public Students(String name, String gender, int age, String grade, int kor, int eng, int math) {
		super(name, gender, age); // this : 나 / super : 상위클래스, 클래스이름과 동일하지만 매써드인것은 상위클래스의 생성자
		
		this.setGrade(grade);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
	
	

}
