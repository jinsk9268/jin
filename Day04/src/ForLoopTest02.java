
public class ForLoopTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//짝수 합
		int even = 0;
		//홀수 합
		int odd = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if (i %2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		
		System.out.println("짝수 합 : " + even +", 홀수 합" + odd);

	}

}
