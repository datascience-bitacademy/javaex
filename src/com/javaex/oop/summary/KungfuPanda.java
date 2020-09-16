package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements Kungfu {
	//	생성자
	public KungfuPanda(String name) {
		super(name);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + ": 아뵤~");
	}

}
