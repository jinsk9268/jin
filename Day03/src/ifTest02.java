
public class ifTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random() * 30) + 1;
		
		if( num % 2 == 0 ) { //나머지
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

}
