import java.util.Arrays;

/**
 * 2차 배열에 값을 넣고
 * 최대/최소값 찾기
 * @author PC
 *
 */

public class DoubleArrayTest03 {

	public static void main(String[] args) {
		
		//배열 선언
		int[][] array = new int[5][5];
		//최대값 변수
		int max = Integer.MIN_VALUE;
		//최소값 변수
		int min = Integer.MAX_VALUE;
		
		/**
		 * 랜덤 함수로 배열에 값 넣기
		 */
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 50) + 1;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++ ) {
				
				//배열값이 max 보다 크면 변경
				if (max < array[i][j]) {
					max = array[i][j];
				}
				
				//배열값이 min 보다 작으면 변경
				if (min > array[i][j]) {
					min = array[i][j];
				}
			}
		}
		
		//배열 출력
		for(int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.println("=======================================================");
		
		System.out.println("최대값 : "+ max + ", 최소값 : "+ min);

	}

}
