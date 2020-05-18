package kr.code.abs;

public abstract class TV {
	
	private String name;
	private int size;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * TV 스펙을 출력하는 추상화메서드 생성
	 */
	public abstract void specInfo();
	
	

}
