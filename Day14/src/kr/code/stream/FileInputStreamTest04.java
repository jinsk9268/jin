package kr.code.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest04 {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("test.txt");
			//인코딩의 기준은 file의 encoding과 같아야 한다.
			is = new InputStreamReader(in, "UTF-8"); //read시 encoding 설정
			int i = 0;
			
			//한글안깨짐
			while((i=is.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) { //예외처리 전체로
			e.printStackTrace();
		} finally {
			try {
				in.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

/*
 * 한글입니다
 * it is english
*/
