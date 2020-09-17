package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//	스택 선언
		//	Last Input First Output(LIFO: 후입선출) 자료형
		//	입력 방향과 출력 방향이 동일하다
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Stack:" + stack);
		
		//	peek : 가장 마지막 입력값을 확인
		System.out.println("peek:" + stack.peek());	//	추출되지는 않음
		System.out.println("Stack:" + stack);
		
		//	인출 : pop
		int item = stack.pop();
		System.out.println("인출된 값:" + item);
		System.out.println("Stack:" + stack);
		
		System.out.println(stack.pop());
		System.out.println("Stack:" + stack);
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		System.out.println("Stack:" + stack);
		
		while(!stack.empty()) {	//	스택이 비어있을 때 pop을 하면 예외 -> 주의
			System.out.println("POP:" + stack.pop());
		}
		
	}

}
