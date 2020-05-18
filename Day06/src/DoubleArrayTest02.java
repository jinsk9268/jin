import java.util.Arrays;

public class DoubleArrayTest02 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][4];
		
		/**
		 * 배열에 값을 입력하기
		 */
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 30) + 1;
			}
		}
		
		/**
		 * 출력해서 보기
		 */
		
		 for(int i = 0; i < array.length; i++) {
			 System.out.println(Arrays.toString(array[i]));
		 }

	}

}
