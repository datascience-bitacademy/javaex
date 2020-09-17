package com.javaex.api.collection.hash;

public class Student {
	//	필드
	private int id;	//	학번
	private String name;	//	이름
	
	//	생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	//	메서드 오버라이드
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// 객체를 식별하는 정수 값
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			//	변환 가능
			Student other = (Student)obj;	//	다운 캐스팅
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}
	
	
}
