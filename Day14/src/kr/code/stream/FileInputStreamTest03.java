package kr.code.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args) {
		// 선언만
		FileInputStream in = null;

		try {
			in = new FileInputStream("test.txt");
			// 최대크기 - 100개까지 읽어오겠다
			int maxBufferSize = 100;
			// 스트림에서 읽을 수 있는 데이터의 개수
			int bytesAvailable = in.available();
			// 둘중에 작은거를 버퍼사이즈로
			int bufferSize = Math.min(bytesAvailable, maxBufferSize); // 둘중작은값을 출력
			// 버퍼 배열 만들기
			byte[] buffer = new byte[bufferSize];

			while (in.read(buffer) != -1) {
				System.out.write(buffer, 0, bufferSize); // 버퍼에 담아서, 배열의 0부터(시작점), 버퍼의 사이즈 만큼(length)
			}
			// io는 사용후 무조건 닫아줘야 한다
			in.close();
		}
		// 파일을 못찾았을경우 처리
		catch (FileNotFoundException e) {
			e.printStackTrace();

			// 파일을 읽다가 에러난 경우 처리
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

/*
 * 한글입니다 
 * it is english
 */
