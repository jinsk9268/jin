package kr.com.inheritance;

public class Person {
	private String name;
	private String gender;
	private int age;
	
	public Person(String name, String gender, int age) {
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
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
	
	public void sleep() {
		System.out.println("사람은 잠을 잡니다");
	}

}
