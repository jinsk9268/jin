package kr.code.inter;

public interface Move {
	
	//인터페이스는 추상화 메서드만 존재 가능
	//public abstract void move (int xPos, int yPos);
	
	/**
	 * 인터페이스는 모든 메서드가 
	 * 추상화이기 때문에
	 * public abstract 기호가 생략 가능합니다.
	 * (클래스에는 추상화메서드, 일반메서드가 같이 존재하므로 추상화 메서드 사용시 public abstract 필요)
	 * @param xPos
	 * @param yPos
	 */
	
	void move (int xPos, int yPos);
	

}
