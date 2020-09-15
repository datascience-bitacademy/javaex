package com.javaex.oop.goods.v4;

//	v4. 자신의 다른 생성자를 호출
public class Goods {
	//	Fields
	private String name;
	private int price;
	private String option;
	
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
	
	public Goods(String name, int price, String option) {
		this(name, price);	//	자기의 다른 생성자 호출
		this.option = option;
	}
	
	//	getter / setter
	public String getName() {
		return name;
	}
	
	//	setter가 없으면 필드는 Read Only
	public void setName(String name) {
		//	this -> 현재 인스턴스 그 자체
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public String getOption() {
		return option;
	}
	
	public void setOption(String option) {
		this.option = option;
	}
	
	//	메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격:" + price);
		
		if (option != null) {
			System.out.println("옵션:" + option);
		}
	}
}
