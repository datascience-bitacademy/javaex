package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		try {
			//	주스트림
			Reader reader = new FileReader(source);
			Writer writer = new FileWriter(target);
			
			//	보조 스트림
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(writer);
			
			//	데이터
			String line = "";
			
			while((line = br.readLine()) != null) {
				//	필터링 Leaf, Leaves가 있는 라인만 추출하여 저장
				if (line.toUpperCase().contains("LEAF") ||
						line.toUpperCase().contains("LEAVES")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine(); //	bw.write("\r\n");
				}
			}
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
