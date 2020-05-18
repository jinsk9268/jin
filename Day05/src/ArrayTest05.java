import java.util.Arrays;

/**
 * 중복값을 넣지 않는 예제
 * @author PC
 *
 */

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		int tempVal = 0; // 임시변수
		
		for (int i = 0; i < array.length; i++) {
			
			tempVal = (int)(Math.random() * 30) +1;
			array[i] = tempVal;
			
			/**
			 * 중복 비교 loop
			 * 중복된 값이 있으며  i값을 하나 빼고...
			 * loop를 중지한다.
			 */
			
			for (int j = 0; j < i; j++) { // 최초값은 안돔, 들어온거 이전까지만 비교하면 되니까 나를 제외하고 나 이전의 값을 비교해
				if(tempVal == array[j]) {
					System.out.println("중복 " + i);
					i--; // 그자리에 다시 넣으라고
					break; // 중복값 나오면 종료
				}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
