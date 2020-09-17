package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue는 인터페이스
		//	실체 클래스는 List 구현체를 사용한다
		//	First Input First Output(FIFO: 선입선출) 자료형
		Queue<Integer> queue = new LinkedList<>();
		
		//	여러 개의 데이터를 제공해 봅시다
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);	//	데이터 입력
		}
		
		System.out.println("QUEUE:" + queue);
		
		//	입력 방향과 인출 방향이 정 반대
		int item = queue.peek(); //	가장 먼저 입력된 데이터 확인
		System.out.println("peek:" + item);
		
		System.out.println("QUEUE:" + queue);
		
		//	인출 : poll -> empty() 반드시 확인 
		while(!queue.isEmpty()) {	//	비어있지 않으면
			System.out.println("인출:" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}

	}

}
