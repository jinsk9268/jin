package kr.code.abs;

public class LedTV extends TV{ 
	
	public LedTV(String name, int size, int price) {
		this.setName(name);
		this.setPrice(price);
		this.setSize(size);
	}

	@Override
	public void specInfo() {
		String str = "";
		str += "LedTV >> 제품명 : " + this.getName() + " 사이즈 : " + this.getSize()
				+ " 가격 : " + this.getPrice();
		
		System.out.println(str);
		
	}
	
}
