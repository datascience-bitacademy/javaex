package com.javaex.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String src = rootPath + "img.jpg";
	private static String tgt = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		//	files\img.jpg를 입력
		//	files\img_copy.jpg로 출력
		try {
			InputStream is = new FileInputStream(src);
			OutputStream os = new FileOutputStream(tgt);
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			os.close();
			is.close();
			
			System.out.println("파일을 복사했어요.");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요.");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
