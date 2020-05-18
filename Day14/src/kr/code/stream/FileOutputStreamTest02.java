package kr.code.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; //출력스트림
		
		long start = 0;
		long end = 0;
		try {
			fis = new FileInputStream("image.png");
			fos = new FileOutputStream("image_copy.png"); //copy file 이름 지정
			
			int i = 0;
			start = System.currentTimeMillis();
			
			//FileInputStream에서 데이터를 1바이트씩 읽는다
			while((i=fis.read()) != -1) {
				//FileOutputStream에 읽은 데이터를 출력한다.
				fos.write(i);
				//버퍼 비우기
				fos.flush();
			}
			
			end = System.currentTimeMillis();
			
			System.out.println("걸린시간 : " + (end - start) + "ms");
			fis.close();
			fos.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
