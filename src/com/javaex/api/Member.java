package com.javaex.api;

//	사용자 정의 객체의 같음, 대소관계를 비교하려면 Comparable 인터페이스를 구현해야 한다
public class Member implements Comparable {
	//	필드
	private String name;
	
	//	생성자
	public Member(String name) {
		this.name = name;
	}

	//	toString
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// 0 : 같다
		//	-1 : 작다
		//	1 : 크다
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
}
