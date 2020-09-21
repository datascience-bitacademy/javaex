package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JDBCEx {

	public static void main(String[] args) {
//		selectTest();
//		guestbookSelectAll();
//		guestbookInsert();
		guestbookSearch();
	}
	
	private static void guestbookUpdate() {
		//	연습문제: 방명록 번호와 비밀번호, 내용을 입력받아
		//	Update하기
	}
	
	private static void guestbookDelete() {
		//	연습문제: 방명록 번호와 비밀번호 입력 받아서
		//	Delete 하기
	}
	
	private static void guestbookSearch() {
		//	키워드 입력 받아서 검색 수행
		guestbookSelectAll();
		GuestbookDao dao = new GuestbookDaoImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		List<GuestbookVo> list = dao.searchByKeyword(keyword);
		
		System.out.println("[검색 결과]");
		
		for (GuestbookVo vo: list) {
			System.out.println("\t" + vo);
		}
		scanner.close();
	}
	
	private static void guestbookInsert() {
		//	스캐너로부터 입력 받아서 guestbook 테이블에 등록
		guestbookSelectAll();
		GuestbookDao dao = new GuestbookDaoImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("비밀번호:");
		String password = scanner.next();
		System.out.print("메시지(단어):");
		String message = scanner.next();
		
		//	DTO 객체 생성
		GuestbookVo vo = new GuestbookVo(null,	//	no 필드 -> PK
				name, password, message,
				null);	//	reg_date 필드 -> now() 세팅
		int insertedCount = dao.insert(vo);
		
		System.out.println(insertedCount + "개의 레코드가 추가되었습니다.");
		
		guestbookSelectAll();
		scanner.close();
	}
	
	private static void guestbookSelectAll() {
		//	DAO 생성
		//	비즈니스 로직과 저장 로직을 분리
		GuestbookDao dao = new GuestbookDaoImpl();
		List<GuestbookVo> list = dao.searchAll();
		
		System.out.println("[방명록]");
		for (GuestbookVo vo: list) {
			System.out.println("\t" + vo);
		}
		System.out.println("==========");
	}
	
	private static void selectTest() {
		//	employees 데이터베이스의 employees 테이블로부터 모든 레코드를 받아서 출력
		String dburl = "jdbc:mariadb://192.168.1.134:3306/employees?useSSL=false";
		String dbuser = "employees";
		String dbpass = "employees";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//	1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			//	2. Connection
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			//	3. Statement
			String sql = "SELECT emp_no, first_name, last_name, birth_date FROM employees";
			stmt = conn.createStatement(); // Statement 생성
			//	4. 쿼리 수행
			rs = stmt.executeQuery(sql);
			//	5. 결과 처리
			while(rs.next()) {	//	커서에서 다음 레코드를 받아오기
				//	컬럼 데이터 받아오기
				Long no = rs.getLong(1);	//	숫자 인덱스 사용 (1부터)
				String firstName = rs.getString("first_name");	//	문자 인덱스(컬럼명)
				String lastName = rs.getNString("last_name");
				Date birthDate = rs.getDate(4);	//	java.util.Date
				
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
				System.out.printf("%d - %s %s (생일: %s)%n", 
						no, firstName, lastName, sdf.format(birthDate));
			}

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//	6. 자원 정리
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
