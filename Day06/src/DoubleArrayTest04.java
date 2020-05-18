
/**
 * 배열의 대각선 값만 더하기 예제
 * @author PC
 *
 */

public class DoubleArrayTest04 {

	public static void main(String[] args) {
		
		//3*3 배열 만들기
		int[][] array = { {10,20,40}, {11,12,13}, {33,22,11}};
		
		/**
		 * 10 20 40
		 * 11 12 13
		 * 33 22 11
		 */
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				//대각선은 i와 j의 값이 같다
				if(i != j) {
					continue;
				}
				
				// i와 j값이 같을때만 더한다
				sum += array[i][j];
				
			}
		}
		
		System.out.println("배열의 대각선 합은 : " + sum);
		
	}

}
