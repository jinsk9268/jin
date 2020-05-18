package kr.code.abs;

public class AbsTvmain {

	public static void main(String[] args) {
		
		TV ledTV = new LedTV("삼성 커브드", 40, 760000);
		TV ipsTV = new IpsTV("LG평면", 60, 900000);
		
		ledTV.specInfo();
		ipsTV.specInfo();
		

	}

}
