package kr.code.reader;

import java.io.File;
import java.io.FileReader;

public class ReaderTest01 {

	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			File file = new File("test.txt");
			
			if(file.exists()) {
				reader = new FileReader(file);
				
				int i = 0;
				
				while((i=reader.read()) != -1) {
					System.out.print((char)i);
				}
				
			} else {
				
			}
			
			/*
			reader = new FileReader("test.txt");
			
			int i = 0;
			
			while((i=reader.read()) != -1) {
				System.out.print((char)i);
			}
			
			reader.close();
			*/
		} catch (Exception e) {
			
		}

	}

}
