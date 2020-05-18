package kr.code.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; //출력스트림
		BufferedInputStream ibuf = null; //input 스트림
		BufferedOutputStream obuf = null; //output 스트림

		long start = 0;
		long end = 0;	
		try {
			fis = new FileInputStream("image.png");
			fos = new FileOutputStream("image_copy.png"); //copy file 이름 지정
			
			ibuf = new BufferedInputStream(fis);
			obuf = new BufferedOutputStream(fos);
			
			int maxBufferSize = 100;
			int bytesAvailable = fis.available();
			int bufferSize = Math.min(maxBufferSize, bytesAvailable);
			
			byte[] buffer = new byte[bufferSize];
			
			start = System.currentTimeMillis();
			
			//FileInputStream에서 데이터를 1바이트씩 읽는다
			while(ibuf.read(buffer) != -1) {
				//FileOutputStream에 읽은 데이터를 출력한다.
				obuf.write(buffer, 0, bufferSize); //버퍼를 넣고 사이즈대로 읽어오기
				//버퍼 비우기
				obuf.flush();
			}
			
			end = System.currentTimeMillis();
			
			System.out.println("걸린시간 : " + (end - start) + "ms");
			
			ibuf.close();
			obuf.close();
			fis.close();
			fos.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
