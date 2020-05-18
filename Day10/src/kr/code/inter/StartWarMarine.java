package kr.code.inter;

public class StartWarMarine {

	public static void main(String[] args) {
		
		Marine marine = new Marine("마린", "총", 500, 0, 30);
		marine.move(10, 100);
		marine.attack("질럿");

	}

}
