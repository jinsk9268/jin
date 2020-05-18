package kr.code.abs;

/**
 * 추상화 클래스
 * @author PC
 *
 */

public abstract class Animal {
	
	private String name; //이름
	private String species;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String toString() {
		String info = "";
		info += "이름 : " + this.getName() + " 종 : " + this.getSpecies();
		return info;
	}
	
	/**
	 * 추상화 메서드 생성
	 * 메서드의 구현 여부는 {} 가 있냐 없냐 임
	 * 내용은 중요하지 않음
	 * 구현의 여부 판단 기준
	 * 구현되지 않고 정의만 되는 메서드에
	 * abstract 지시자를 붙여서 추상화 메서드로 한다.
	 */
	
	public abstract void eatFood ();
	
}


