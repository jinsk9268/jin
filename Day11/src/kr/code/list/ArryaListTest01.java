package kr.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List; 

public class ArryaListTest01 {

	public static void main(String[] args) {
		
		//list 선언, ctrl + shift + o
		/**
		 * list 객체 선언
		 * 
		 * List <Generic> 변수명 = new ArrayList<Generic>();
		 * Generic은 해당 리스트에 들어갈 데이터 타입을 명시한다
		 * jdk 1.7이상에서는 선언시에
		 * 두번째 붙는 Generic 타입은 생략가능
		 * List<Integer> list = new ArrayList<>(); //Integer 생략가능
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		
		//리스트의 삽입 - add
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		//리스트의 중간삽입 add(index, value);
		//중간삽입하면 원래있던값이 삭제되는게 아니라 뒤로 밀림
		list.add(3, 10);
		list.add(4, 11);
		
		//리스트의 치환 set(index, value);
		list.set(0, 11);
	
		//출력 -ver.1 get(index);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //get이라는 메서드에 index 값을 집어넣으면 나옴
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//출력 -ver.2 foreach 사용
		for(int num : list) { //list 있는 값을 num이라는 값에 하나하나 매핑
			System.out.println(num);
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//출력 -ver.3 iterator 를 이용한 출력, 추천방법
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) { //iterator 화살표, hasNext 값 있는지 물어보는거
			System.out.println(iter.next()); // next 이동하는거
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//출력 -ver.4 배열 Arrays 를 이요한 단순 출력
		System.out.println(Arrays.deepToString(list.toArray()));
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//list 삭제, remove(index)
		System.out.println("삭제 전 사이즈 : " + list.size());
		
		list.remove(1);
		list.remove(2);
		
		System.out.println("삭제 후 사이즈 : " + list.size());
		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		//list 배열 전체 삭제 clear();
		
		list.clear();
		System.out.println("전체 삭제 후 사이즈 : " + list.size());
	}

}
