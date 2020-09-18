package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringBufferEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		try {
			Reader freader = new FileReader(filename);	//	주스트림
			BufferedReader br = new BufferedReader(freader);	//	보조 스트림
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");	//	공백을 기준으로 분절
				
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
