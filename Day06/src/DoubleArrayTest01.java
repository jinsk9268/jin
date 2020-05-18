import java.util.Arrays;

/**
 * 2차원 배열 기본 예제
 * array in array (array 안에 array들의 집합)
 * 행의 길이와 열의 길이를 따로따로 구할 수 있다
 */

public class DoubleArrayTest01 {

	public static void main(String[] args) {
		
		// 배열의 기본 선언
		int[][] array1 = new int[3][4];
		
		/**
		 * 선언할때 값을 주입
		 * 배열을 선언시에만 사용 가능
		 */
		
		int[][] array2 = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		
		/**
		 * 열이 없이 선언 가능
		 * 단 행은 무조건 존재해야함
		 */
		
		int[][] array3 = new int[3][];
		
		// 배열 자체를 출력할 경우는 주소값이 나온다
		// 해당 주소값은 배열에 행..에대한 주소이다
		
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		
		System.out.println();
		
		// 배열의 행을 출력한 경우에도 주소가 값이 나온다
		// 이는 각 행이 가지는 열들의 주소이다
		
		System.out.println(array1[0]);
		System.out.println(array2[1]);
		System.out.println(array3[2]); // 세번째는 값이 없기때문에 null 열이 없는 배열은 각 열을 재정의해줘야 함 )초기화 해주기)
		
		/**
		 * 2차배열의 출력
		 * 이중 for loop를 사용한다
		 */
		
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		/**
		 * for loop 1개로 출력하기
		 */
		
		System.out.println();
		
		for(int i = 0; i < array1.length; i++) {
			
			System.out.println(Arrays.toString(array1[i])); // 단순 출력할때만 사용 가능
		}

	}

}
