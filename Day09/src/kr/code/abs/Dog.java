package kr.code.abs;

public class Dog extends Animal {
	
	public Dog(String name, String species) {
		super();
		this.setName(name);
		this.setSpecies(species);
	}

	@Override
	public void eatFood() {
		String str = "강아지는 아무거나 다 잘먹습니다";
				
		System.out.println(str);
		
	}

}
