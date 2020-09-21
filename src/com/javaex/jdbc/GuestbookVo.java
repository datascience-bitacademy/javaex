package com.javaex.jdbc;

import java.util.Date;

//	DTO(VO: 객체간 데이터 전송을 위한 값 객체)
//		필드, getter/setter, 기본 생성자
//		부가적: toString, equals 정도만 구현
//		로직 코드는 작성하지 않는다
public class GuestbookVo {
	//	필드
	private Long no;	//	VO 객체에서는 기본 타입은 사용하지 않는다
	private String name;
	private String password;
	private String message;
	private Date regDate;
	//	생성자 : VO 객체에서는 반드시 기본 생성자가 있어야 한다
	public GuestbookVo() {
		//	기본 생성자
	}
	
	public GuestbookVo(Long no, String name, String password, String message, Date regDate) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.message = message;
		this.regDate = regDate;
	}
	
	//	Getter/Setter
	public Long getNo() {
		return no;
	}
	
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message
				+ ", regDate=" + regDate + "]";
	}
}
