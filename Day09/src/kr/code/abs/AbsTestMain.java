package kr.code.abs;

public class AbsTestMain {
	
	/**
	 * 파라미터 타입이 부모 객체로 되어있으면,
	 * 상위클래스를 상속받은 모든 하위개체를 받을수 있다
	 * 하나의 메서드로 여러가지 클래스 처리가 가능
	 * @param animal
	 */
	
	public static void getInfo(Animal animal) {
		animal.eatFood();
	}

	public static void main(String[] args) {
		
		//생성자를 통한 데이터 주입
		Cat cat = new Cat("야옹이", "페르시아고양이");
		Animal dog = new Dog ("바둑이", "시츄");
		
		AbsTestMain.getInfo(cat);
		AbsTestMain.getInfo(dog);

	}

}
