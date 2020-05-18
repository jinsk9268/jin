
public class DoubleLoopTest03 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			/* 공백을 찍기위한 for문 */
			for (int j = (10-i); j > 0; j--) { // (10-i) 라인 바뀔때마다 공백 줄이기 위해, i값이 증가하면 j의 시작값을 빼기 때문에
				System.out.print(" ");
			}
			
			/* 실제 별을 찍기위한 for문, 공백다찍었으면 별찍어야지 */
			for(int k = 0; k< (2*i)+1; k++) { // 홀수로 증가
				System.out.print("*");
			}
			
			/* 라인 변경을 위해서! */
			System.out.println();
		}

	}

}
