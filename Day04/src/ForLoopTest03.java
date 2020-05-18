
public class ForLoopTest03 {

	public static void main(String[] args) {
		
		int randomValue = 0;
		int sum = 0; // 합을 위한 변수
		
		while(true) {
			randomValue = (int)(Math.random() *150) +1; // 1~150사이의 랜덤값
			
			if (randomValue%2 != 0 ) { // 2로 나눈값 나머지가 0이 아니라면 즉 홀수면
				continue; // 홀수니까 계속, 멈추긴 멈추는데 여기서 끝 다시, 부합하지 않으면 돌려보낸다, 다음 오라고, 조건이 맞지않으면 다음거를 부른다
			} else if (randomValue == 100) {
				break; // 100이면 멈춘다, 아예 끝내버리는거
			}
			
			sum += randomValue; // 100이 아니거나 짝수인 수만 더할 수 있음
		}
		
		System.out.println("합 : " + sum);

	}

}
