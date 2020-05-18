
public class ForLoopTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; // 변수의 초기화, 자기자신한테 어떤 값을 누적시킬때는 초기값 꼭 필요 , 안하면 컴퓨터가 쓰레기값을 넣기 때문
					 // 초기값 주지 않으면 컴퓨터가 스스로 넣음, 누적할때는 기준(시작값)을 알아야하기때문, method상에서 변수사용할때는 초기화 사용(누적할때)
		
		for(int i = 1; i <= 10; i++) { // 1 ~ 10까지 돈다
			sum += i;
		}
		
		System.out.println("1 ~ 10 합 : " + sum);
	}

}
