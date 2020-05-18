package kr.code.inter;

/**
 * Fight가 가지고 있는 정의된 메서드를 구현하지 않으면,
 * 상속한 하위클래스는
 * 추상화 메서드를 지녀야하기때문에
 * 추상화 클래스가 되어야한다.
 * @author PC
 *
 */

public abstract class Unit implements Fight {
	
	private int xPos; // x좌표
	private int yPos; // y좌표
	private int hp; // 생명력
	private String unitName; // 이름
	private String weapon; //무기
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	

}
