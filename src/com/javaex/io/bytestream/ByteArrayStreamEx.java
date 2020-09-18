package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//	배열 데이터를 입출력하는 바이트 스트림
public class ByteArrayStreamEx {
	//	Stream 
	//	프로그램과 입력 소스 혹은 출력 타겟을 연결하는 클래스
	//	일방향
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };	//	입력 소스
		byte[] outTarget = null;
		
		//	인풋 소스 확인
		System.out.println("입력 소스:" + Arrays.toString(inSrc));

		try {
			//	입력 스트림
			InputStream bis = new ByteArrayInputStream(inSrc);
			//	출력 스트림
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0;	//	인풋 스트림의 데이터를 저장
			
			while((data = bis.read()) != -1) {
				System.out.println("Read Data:" + data);
				bos.write(data);
			}
			
			//	아웃풋 타겟에 연결
			outTarget = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("타겟 배열:" + Arrays.toString(outTarget));
			
			//	시스템 자원은 반환
			bos.close();
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
