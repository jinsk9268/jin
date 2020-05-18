package kr.code.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyInputStreamTest01 {

	public static void main(String[] args) {
		InputStreamReader isr = null; //키보드 입력
		
		isr = new InputStreamReader (System.in);
		//보조 스트림 buffer 메모리를 사용하여 기능 향상 목적으로 쓴다
		BufferedReader r = new BufferedReader(isr);
		
		int i = 0;
		
		//InputStreamReader에서 한문자씩 읽으면서 Loop를 돈다
		//종료는 ctrl+z를 누르면 됨
		
		try {
			System.out.println("키입력>>>>>");
			while((i=r.read()) != -1) {
				//StreamReader는 문자입력값을 아스키코드값으로 가져오기때문에 (char) 캐스팅으로
				//문자값으로 변경해줘야 잘 나온다
				 System.out.print((char)i);
			}
			
			r.close();
			isr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*
 * 한글
 * 한글
 * 한글인가?
 * 한글인가?
 * 한글인건가
 * 한글인건가
 * 라면인건가
 * 라면인건가
*/
