package kr.code.inter;

public class Marine extends Unit {
	
	public Marine (String unitName, String weapon, int hp, int xPos, int yPos) {
		
		this.setUnitName(unitName);
		this.setWeapon(weapon);
		this.setHp(hp);
		this.setxPos(xPos);
		this.setyPos(yPos);
		
	}

	@Override
	public void move(int xPos, int yPos) {
		System.out.printf("현재 %d, %d에서 %d, %d 으로 이동\n", getxPos(), getyPos(), xPos, yPos);
		
		this.setxPos(xPos);
		this.setyPos(yPos);
		
	}

	@Override
	public void attack(String target) {
		System.out.println(this.getUnitName() + " 이 " + target + "을 공격합니다.");
		
	}

}
