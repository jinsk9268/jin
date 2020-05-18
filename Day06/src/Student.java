import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 학생정보를 담는 클래스
 * @author PC
 *
 */

public class Student {
	
	/**
	 * 학생 정보를
	 * 담는 변수를
	 * member 변수 또는 인스턴스 변수라고 함.
	 */
	
	private String name; // 이름
	private String gender; // 성별
	private int age; // 나이
	private String grade; // 학년
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	
	/**
	 * getter setter 만드는 법
	 * Source -> Generate Getters and Setters -> Select All -> Generate
	 * @param name
	 */

	public void setName(String name) {
		this.name = name; // this : class 본인, 나는   class가 가지고있는 name이에요, 같은 이름이 있을때 누가 class의 method이고 변수인지 나타내기 위해
	}
	
	public String getName() {
		return this.name;
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
	
	/* 학생 성적의 총점을 구하는 method */
	public int getTotal() {
		//return (this.kor + this.math + this.eng); // 둘다 가능, 직접 접근, 변수에 직접 접근해서 더함
		return (this.getKor() + this.getMath() + this.getEng()); // getter로 간접 접근 , 데이터에 직접 접근하지 말고 getter setter로 접근해서 불러오거나 수정, 자바 구조상 더 맞다
	}
	
	/* 학생 성적의 평군을 구하는 method */
	public double getAvg() {
		
		//double jumsu = (double)getTotal() / 3;
		//double avg = new BigDecimal(jumsu).setScale(2, RoudingMode.HALF_UP).doubleValue();
		
		double avg = new BigDecimal( (double)getTotal() / 3).setScale(2, RoundingMode.HALF_UP).doubleValue(); //BigDecimal 모든수 처리, setScal 소수점처리, doubleValue() 처리해줘
	}
}
