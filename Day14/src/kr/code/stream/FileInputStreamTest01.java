package kr.code.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		//선언만
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("test.txt"); //파일안에 위치해있으므로 경로안써줘도됨
			int read = 0; //byte로 해야되는데 더 큰단위로 올수도있기때문
			
			while((read=in.read()) != -1) { //읽는거를 한땀한땀  read에 담는다. in이 read하는것을  read에 대입하고 -1(종료)이 아닐때 까지
				/**
				 * 한글자씩 읽어오기때문에 space bar나 enter문자도 읽어서
				 * 자동으로 줄바꿈 또는 띄어쓰기가 가능한것.
				 */
				System.out.print((char)read); //byte 아스키값으로 읽어오므로  char로 캐스팅해줘야 문자가 나옴
			}
			
			//io는 사용후 무조건 닫아줘야 한다
			in.close(); //맨마지막에 놓을수도있음
		
			//파일을 못찾았을 경우 처리
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			//파일을 읽다가 에러난 경우 처리
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*결과
 *íê¸ìëë¤
 *it is english
 */

