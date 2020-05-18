
public class MabanJinTest {

	public static void main(String[] args) {
		
		int maxLength = 5; // 최대길이
		int[][] mabang = new int[maxLength][maxLength]; // 마방진
		
		int row = 0;
		int col = 2; // 시작위치가 [0,2] 이기 때문
		
		// 마방진 초기화
		mabang[row][col] = 1;
		
		// 시작값 1은 들어있으니까 for loop은 2부터 시작한다
		for (int i = 2; i < (maxLength* maxLength)+1; i++) {
			
				//시작하면 대각선 위로 이동
				row = row -1;
				col = col +1;
				
				// 1. 행이 넘어가면 해당 열의 끝으로 보낸다
				if (row < 0 && col <maxLength) {
					row = (maxLength) -1;
			}
				
				// 2. 열이 넘어가면 해당 행의 처음으로 보낸다
				if(col >= maxLength && row >= 0) {
					col = 0;
				}
				
				// 3. 둘다 넘어가면 직전값의 밑에 둔다
				if (row < 0 && col >=maxLength) {
					row += 2;
					col -= 1;
				}
				
				// 4. 내 위치에 값이 있네? 그럼 3번과 같이 한다
				if (mabang[row][col] != 0) {
					row += 2;
					col -= 1;
				}	
				
				mabang[row][col] = i;
		}
		
		// 출력
		for(int i = 0; i < maxLength; i++) {
			for(int j = 0; j < maxLength; j++) {
				System.out.print(mabang[i][j] +"\t");
			}
			System.out.println();
		}
			
	}

}
