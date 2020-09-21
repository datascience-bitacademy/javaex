package com.javaex.jdbc;

import java.util.List;

//	설계 규약
//	비즈니스 로직과 저장 레이어간 DAO 통신을 위한 설계
public interface GuestbookDao {
	public List<GuestbookVo> searchAll(); //	SELECT
	public int insert(GuestbookVo vo);	//	INSERT
	public int update(GuestbookVo vo);	//	UPDATE
	public int delete(Long no, String password);	//	DELETE
	public List<GuestbookVo> searchByKeyword(String keyword);	//	SELECT Like 검색
}
