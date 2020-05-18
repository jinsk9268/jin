import java.util.Arrays;

/**
 * 배열에서 최대/최소값을 찾기
 * @author PC
 *
 */

public class ArrayTest04 {

	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE; // 최소값 변수 , 기본값을 제일 큰거를 넣어야 다음에 오는 값이랑 비교가 되니까
		int max = Integer.MIN_VALUE; // 최대값 변수 , 기본값을 제일 작은거를 넣어야 다음에 오는 값이랑 비교가 되니까
		
		int[] array = new int[10];
		
		// 배열에 값을 입력하기
		for (int i = 0; i < array.length; i++) {
					array[i] = (int)(Math.random() * 50) + 1;
		}
		
		// 최대값/ 최소값 찾기
		
		for(int i =0; i < array.length ; i++) {
			
			//max보다 크면 변경
			if (max < array[i]) { // 처음에 제일 작은값이니까 차근차근 비교해서 제일 큰거 
				max = array[i];
			}
			
			//min보다 작으면 변경
			if (min > array[i]) { // 처음에 제일 큰값이니까 차근차근 비교해서 제일 작은거
				min = array[i];
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
				
	}

}
