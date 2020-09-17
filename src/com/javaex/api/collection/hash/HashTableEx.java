package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

	public static void main(String[] args) {
		//	키 - String, 값 - ClassRoom
		Hashtable<String, ClassRoom> ht = new Hashtable<>();

		//	맵에 데이터 넣기
		ht.put("J101", new ClassRoom("Java", "101"));
		ht.put("C202", new ClassRoom("C", "202"));
		ht.put("P303", new ClassRoom("Python", "303"));
		ht.put("L404", new ClassRoom("Linux", "404"));
		
		System.out.println("강의장 목록:" + ht);	//	순서는 없다
		
		//	맵에서 데이터 가져오기 : get
		System.out.println("P303 과목의 강의장:" + ht.get("P303"));
		
		//	키가 있는지 확인 : containsKey()
		System.out.println("키 L404 있는가? " + ht.containsKey("L404"));
		
		//	값의 확인 : containsValue();
		System.out.println("Java 강의실 확인:" + ht.containsValue("Java"));	//	false
		System.out.println("Java 강의실 확인:" + ht.containsValue(new ClassRoom("Java")));
		
		//	Iterator
		Iterator<String> it = ht.keySet().iterator();	//	키를 순회하는 iterator
		
		while(it.hasNext()) {
			ClassRoom room = ht.get(it.next());
			System.out.println("클래스룸:" + room);
		}
		
		//	맵을 비움
		ht.clear();
		System.out.println("맵:" + ht);
	}

}
