package kr.code.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		
		//기본적인 hashMap 생성
		//맵은 generic 이 <key, value> 각각의 타입을 지정한다
		Map<String, String> map = new HashMap<>();
		
		//1. 데이터 삽입
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		
		/**
		 * 2. 중복불허
		 * 중복키가 발생하면 해당 키에 대응하는 값이 치환
		 */
		map.put("two", "22");
		
		//3. 맵의 데이터 삭제. remove(key)
		map.remove("four");
		
		//4. 데이터 검색 - key 기준 or value 기준
		System.out.println(map.containsKey("two"));
		System.out.println(map.containsKey("111"));
		System.out.println(map.containsValue("1")); //정확한 위치는 안나타남
		System.out.println(map.containsValue("5555"));
		
		System.out.println("------------------------");
		
		//map 출력1. key를 이용한 출력
		Set<String> keys = map.keySet();
		
		Iterator<String> keyIter = keys.iterator();
		
		//인덱스가 없으므로 일반적인 for문은 사용할 수 없다
		while(keyIter.hasNext()) {
			System.out.println(map.get(keyIter.next()));
		}
		
		System.out.println("------------------------");
		
		Set<Entry<String, String>> entry = map.entrySet();
		
		Iterator<Entry<String, String>> eIter = entry.iterator();
		
		while(eIter.hasNext()) {
			Map.Entry<String, String> en = eIter.next();
			System.out.println("key :" + en.getKey() + " value : " + en.getValue());
		}
	}	
	
}
