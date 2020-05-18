package kr.code.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyInputStreamTest02 {

	public static void main(String[] args) {
		InputStreamReader isr = null; //키보드 입력, 단순키입력은 스캐너가 좋고, 키보드입력제약조건 줄때는 inputstream이 좋다
		
		isr = new InputStreamReader(System.in);
		
		//보조스트림 buffer 메모리를 사용하여 기능 향상 목적으로 쓴다
		BufferedReader r = new BufferedReader(isr);
		
		
		try {
			/**
			 * readLine()는 스캐너의 nextLine와 같이 flush 기능이 있다
			 */
			String str = "";
			while(!(str = r.readLine()).contentEquals("q")) {
				System.out.println(str);
			}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

/* 결과
 * 사랑
 * 사랑
 * 용기
 * 용기
*/
