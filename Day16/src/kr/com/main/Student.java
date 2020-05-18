package kr.com.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	private int stNum;
	private String stName;
	private int stAge;
	private String stGender;
	private int stKor;
	private int stEng;
	private int stMath;
	
	
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStAge() {
		return stAge;
	}
	public void setStAge(int stAge) {
		this.stAge = stAge;
	}
	public String getStGender() {
		return stGender;
	}
	public void setStGender(String stGender) {
		this.stGender = stGender;
	}
	public int getStKor() {
		return stKor;
	}
	public void setStKor(int stKor) {
		this.stKor = stKor;
	}
	public int getStEng() {
		return stEng;
	}
	public void setStEng(int stEng) {
		this.stEng = stEng;
	}
	public int getStMath() {
		return stMath;
	}
	public void setStMath(int stMath) {
		this.stMath = stMath;
	}
	
	//총점 출력 메서드
	public int getTotal() {
		return (this.getStKor() + this.getStEng() + this.getStMath());
	}
		
		//평균 출력 메서드
	public double getAvg() {
		double avg = (this.getTotal() /3);
			
		//숫자를 다루는 BingDecimal 클래스를 사용하여 소수점 반올림 계산
		BigDecimal big = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP);
			
		//BingDecimal은 다양한 숫자를 다루기 때문에 출력시 어떤타입으로 출력할지 메서드를 실행한다
		return big.doubleValue();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("학번 :" + this.getStNum() + ", ");
		sb.append("이름 :" + this.getStName() + ", ");
		sb.append("나이 :" + this.getStAge() + ", ");
		sb.append("성별 :" + this.getStGender() + ", ");
		sb.append("국어 :" + this.getStKor() + ", ");
		sb.append("영어 :" + this.getStEng() + ", ");
		sb.append("수학 :" + this.getStMath() + ", ");
		sb.append("총점 :" + this.getTotal() + ", ");
		sb.append("총점 :" + this.getAvg() + ", ");
		
		return sb.toString();
	}

}
