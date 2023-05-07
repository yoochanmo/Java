package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 	Map Collection
 	
 	Map 컬렉션은 키(Key)와 값(Value)으로 구성된 Map.Entry객체를 저장하는 구조를 가지고 있다.
 	키와 값은 모두 참조타입(객체)이다. 키는 중복이 불가하고 값은 중복저장이 가능하다.
 	만약, 기존에 저장된 키와 동일한 키가 있다면 기존값은 없어지고 새로운 값이 대체된다.
 	
 	Map컬렉션은 HashMap, HashTable, Properties, TreeMap등이 있다. Map에 대한 값을 얻고자할 경우에는
 	2가지 방법이 있다.
 	
 	키값을 알고 있다면 get()메서드로 간단히 객체를 검색할 수 있지만 저장된 전체 객체를 대상으로
 	값을 하나씩 일고자 할 경우에는 
 	
 	1 . keySet()    : 이 메서드로 모든 키를 set컬렉션으로 저장한 후에 반복자(Iterator)를 통해서
 					  키를 하나씩 읽은 후에 get()메서드를 이용해서 값을 읽는 방법
 					  
 	2 . entrySet()  : 이 메서드로 모든 Map.Entry 객체를 set컬렉션으로 읽은 후 반복자를 통해
 					  Map.Entry객체를 하나씩 읽어서 getKey(), getValue()메서드를 이용해서 읽는 방법이 있다.
 */
public class HashMapMain1 {

	public static void main(String[] args) {
		
		// 1 . Map 객체생성
			   Map<String, Integer> map = new HashMap<>();
		
	   // 2 . 객체저장 - put()
			   map.put("홍길동",85 );
			   map.put("홍길리",Integer.valueOf(80) );
			   map.put("홍길중",98 );
			   map.put("홍길딱",75 );
			   map.put("홍길순",70);
			   map.put("홍길죽",65 );
			   map.put("홍길동",12); // 키가 중복, 에러는 발생하지 않지만 최종값으로 대체 즉, 85점이 90점으로 대체
			   System.out.println("총 객체 수 = " + map.size());
		
			   Map<Integer, String> map2 = new HashMap<>();
			   map2.put(1, "나얼");
			   map2.put(1, "소향");
			   System.out.println("총 객체 수 = " + map2.size());
		
	    // 3 . 객체검색(1) = get()
			   System.out.println("홍길동의 점수 = " + map.get("홍길동"));
			   System.out.println("홍길중의 점수 = " + map.get("홍길중"));
			   System.out.println();
		
		// 4 . 객체검색(2) = keySet()
			   Set<String> keySet = map.keySet();
			   Iterator<String> names = keySet.iterator();
			   while(names.hasNext()) {
				   String name = names.next();
				   Integer score = map.get(name);
				   System.out.println(name + "의 점수 = " + score);
			   }
			   System.out.println();
			   
		// 5 . 객체검색(3) = entrySet()
			   Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			   Iterator<Map.Entry<String, Integer>> entrys = entrySet.iterator();
			   while(entrys.hasNext()) {
				   Map.Entry<String, Integer> entry = entrys.next();
				   String name = entry.getKey();
				   Integer score = entry.getValue();
				   System.out.println( name + "의 점수 = " + score);
			   }
			   System.out.println();
			   
		 // 6 . 객체삭제
			   map.remove("홍길동");
			   System.out.println("총 객체 수 = " + map.size());
			   
			   
			   
		// 7 . 전체삭제
			   map.clear();
			   System.out.println("총 객체 수 = " + map.size());
	}

}
