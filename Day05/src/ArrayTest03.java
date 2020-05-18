import java.util.Arrays;

/**
 * 버블 정렬을 이용하지 않고
 * array를 이용한 정렬 방법
 *
 */

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		// 배열에 값을 입력하기
				for (int i = 0; i < array.length; i++) {
					array[i] = (int)(Math.random() * 30) + 1;
				}
				
				System.out.println("정렬 전");
				System.out.println(Arrays.toString(array));
				
				//Arrays 를 이용한 정렬 , 오름차순 정렬
				Arrays.sort(array);
				
				System.out.println("정렬 후");
				System.out.println(Arrays.toString(array));
		

	}

}
