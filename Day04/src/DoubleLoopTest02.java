
/**
 * 
 *  별찍기1 - 직각삼각형
 *
 */

public class DoubleLoopTest02 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) { // 0부터 9까지
			for (int j = 0; j < (i+1); j++) { // 0부터 i보다 1나더 큰거보다 작을때까지
				System.out.print("*");
			}
			
			System.out.println();
		}
		//줄띄고
		System.out.println();
		
		for(int i = 10; i > 0; i--) {
			for(int j = 0; j < i; j++) { // 맨처음음 10보다 작은거니까 10개 찍힘 (j가 0이므로)
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
