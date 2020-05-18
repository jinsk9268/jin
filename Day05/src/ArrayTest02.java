import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		// 배열에 값을 입력하기
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 30) + 1;
		}
		
		// 출력 - 배열의 유형  class 를 이용하여 출력
		System.out.println(Arrays.toString(array)); // 배열을 스트링 구조로 펼쳐서 출력 , import java.util.Arrays; 소팅의 기본 기능은 오름차순 정렬, 내림차순정렬도 하고싶으면 버블정렬
		
		// 버를 정렬을 이용한 sorting
		
		// 임시변수..
		
		int tempVal = 0;
		
		for(int i = array.length-1; i>0; i--) { // array.length-1 인덱스는 4 -> array[j+1] 보다 1 큰거 설정했으므로
			for(int j = 0; j < i; j++) { //j의 조건이 i 한번 루프 돌때마다  i값은 빠짐(마지막에 값을 보내놨으므로 볼 필요x)
				if(array[j] > array[j+1]) {
					tempVal = array[j+1]; // 바뀔 대상값이 저장되어야하므로
					array[j+1] = array[j]; // 앞 뒤 체인지 , 전에 j+1이었던거 현재 내가 됨
					array[j] = tempVal;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));

	}
	

}
