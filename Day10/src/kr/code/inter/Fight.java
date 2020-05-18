package kr.code.inter;

public interface Fight extends Move, Shoot { 
	
	//인터페이스 다중상속할때 사용 , Fight 안에 Move, Shoot가 들어가있으므로 
	//extends - 같은 종족을 상속할때 사용, 다중상속 가능 (클래스와 클래스, 인터페이스와 인터페이스)
	//implements - 다른 종족을 상속할때 사용 (클래스와 인터페이스)

}
