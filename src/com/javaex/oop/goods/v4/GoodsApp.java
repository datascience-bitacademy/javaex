package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		//	사용(참조)
		Goods notebook = new Goods("LG Gram", 1600000);
		
		Goods smartphone = new Goods("iPhone SE", 600000);
		Goods smartphone2 = new Goods("iPhone SE", 800000, "256GB");
		
		//	출력
		notebook.showInfo();
		smartphone.showInfo();
		smartphone2.showInfo();
	}

}
