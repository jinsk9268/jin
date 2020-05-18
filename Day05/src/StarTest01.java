
public class StarTest01 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j<= (10+i); j++) { // 처음엔 10, 두번째는 11 라인 늘어날때마다 j가 늘어날 수 있는 값이 늘어나니까 마지막 지점에는 *을 찍어야함
				
				if(j < (10-i)) {
					System.out.print(" "); // 시작위치 이전까진 공백
				} else {
					System.out.print("*"); // 그이후는 *
				}
			}
			System.out.println();
		}
		
		

	}

}
