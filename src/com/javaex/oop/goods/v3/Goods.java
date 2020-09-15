package com.javaex.oop.goods.v3;

//	v3. 필드를 Read Only로 변경 + 생성자 추가
public class Goods {
	//	Fields
	private String name;
	private int price;
	
	//	생성자 : new 키워드로 실행
	//		객체 초기화 담당
	//		생성자가 없으면 컴파일러가 기본 생성자를 임의로 추가
	
	//	기본 생성자
//	public Goods() {
//		
//	}
	
	//	사용자 정의 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//	getter / setter
	public String getName() {
		return name;
	}
	
	//	setter가 없으면 필드는 Read Only
//	public void setName(String name) {
//		//	this -> 현재 인스턴스 그 자체
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격:" + price);
	}
}
