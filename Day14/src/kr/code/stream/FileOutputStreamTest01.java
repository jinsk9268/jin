package kr.code.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		
		try {
			int n = 0;
			
			//true는 파일에 내용을 계속 추가할지를 결졍. true를 하지 않으면 내용이 지워지고 새로 써진다.
			FileOutputStream fos = new FileOutputStream("write.txt",true);
			System.out.println("내용을 입력하세요");
			while((n=System.in.read()) != -1) {
				fos.write(n); //OutPutStream에 내용을 기록한다
				fos.flush(); //스트림에 있는 데이터를 출력한다
			}
			
			System.in.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
