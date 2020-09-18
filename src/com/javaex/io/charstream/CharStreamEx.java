package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "char.txt";
	public static void main(String[] args) {
		try {
			Writer fwriter = new FileWriter(filename);
			
			//	텍스트 저장
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2020. 09\r\n");
			
			fwriter.close();
			
			Reader freader = new FileReader(filename);
			
			//	텍스트 읽어와서 출력
			
			int data = 0;
			while((data = freader.read()) != -1) {
				System.out.print((char)data);	//	다운 캐스팅
			}
			System.out.println();	//	개행
			freader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
