package kr.code.stream;

import java.io.File;

public interface FileTest {
	public static void main(String[] args) {
		
		File file = new File("test.txt"); //디렉토리, 파일이름
		System.out.println("파일의 경로는? " + file.getPath());
		System.out.println("파일의 이름은?" + file.getName());
		System.out.println("파일의 상위디렉토리는? " + file.getParent());
		System.out.println("파일의 절대 경로는? " + file.getAbsolutePath());
		System.out.println("파일이 절대 경로냐? " + file.isAbsolute());
		System.out.println("파일이 존재하냐? " + file.exists());
		System.out.println("파일이냐? " + file.isFile());
		System.out.println("디렉토리이냐? " + file.isDirectory());
		System.out.println("파일을 읽을 수 있냐? " + file.canRead());
		System.out.println("파일을 쓸 수 있냐? " + file.canWrite());
		System.out.println("파일의 바이트 크기는? " + file.length());
		
		//모든운영체제의 호환성을 위해서 경로 구분자를 사용한다.
		//리눅스는 파일 경로를 쓸때 /home/lib/....쓴다
		//윈도우는 파일 경로를 쓸때 \home\lib...쓴다. 다르다.
		
		boolean b = new File("." + File.separator + "hello").mkdirs(); //경로에 맞게 폴더를 생성
		
		//boolean b = new File("./hello").mkdir(); //리눅스 파일 경로 표현법 , . 현재 내위치
		//boolean b = new File(".\\hello").mkdir(); //윈도우 파일 경로 표현법 , . 현재 내위치
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉토리 내용은?");
		for(int i=0; i<listing.length; i++) {
			System.out.println(listing[i]);
		}
	}

}
