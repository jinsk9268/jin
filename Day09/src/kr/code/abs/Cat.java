package kr.code.abs;

public class Cat extends Animal {

	public Cat(String name, String species) {
		super();
		this.setName(name);
		this.setSpecies(species);
	}

	@Override
	public void eatFood() {
		String str = "고양이는 우유를 주면 안됩니다";
				
		System.out.println(str);
		
	}
	
}
