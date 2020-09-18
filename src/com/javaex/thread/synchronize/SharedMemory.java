package com.javaex.thread.synchronize;

//	여러 쓰레드가 공용으로 사용할 객체
public class SharedMemory {
	//	필드
	private int memory;

	//	Getter / Setter
	public int getMemory() {
		return memory;
	}

	//	synchronized 키워드를 메서드 사용하면 객체가 Lock
	//	임계 영역: 멀티 쓰레드 프로그램에서 단 하나의 쓰레드만 실행할 수 있는 코드 영역
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);	//	1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}	
}
