package kr.code.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest02 {

	public static void main(String[] args) {
		
		FileReader reader = null;
		BufferedReader buf = null;
		
		try {
			reader = new FileReader("test.txt");
			buf = new BufferedReader(reader);
			
			String str = null;
			
			while((str = buf.readLine()) != null) {
				System.out.println(str);
			}
			
			buf.close();
			reader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
