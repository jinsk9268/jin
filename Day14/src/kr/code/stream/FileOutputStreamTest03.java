package kr.code.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; //출력스트림

		long start = 0;
		long end = 0;	
		try {
			fis = new FileInputStream("image.png");
			fos = new FileOutputStream("image_copy.png"); //copy file 이름 지정
			
			int maxBufferSize = 100;
			int bytesAvailable = fis.available();
			int bufferSize = Math.min(maxBufferSize, bytesAvailable);
			
			byte[] buffer = new byte[bufferSize];
			
			start = System.currentTimeMillis();
			
			//FileInputStream에서 데이터를 1바이트씩 읽는다
			while(fis.read(buffer) != -1) {
				//FileOutputStream에 읽은 데이터를 출력한다.
				fos.write(buffer, 0, bufferSize);
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
