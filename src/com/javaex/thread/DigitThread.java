package com.javaex.thread;

//	방식 1. Thread 상속 
//		-> Thread 클래스를 세부적으로 조정할 수 있다
public class DigitThread extends Thread {
	//	쓰레드 실행 로직
	@Override
	public void run() {
		//	직접 호출하면 Thread가 아닌 메서드
		for (int i = 1; i <= 20; i++) {
			System.out.printf("[%s]:%d%n", getName(), i);
//			잠시 지연
			try {
				Thread.sleep(400);	//	0.4초 지연
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
