package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//	기본 타입을 저장하고 읽기 위한 byte 보조 스트림
		try {
			OutputStream os = new FileOutputStream(filename);	//	주스트림
			DataOutputStream dos = new DataOutputStream(os);	//	보조 스트림
			
			dos.writeUTF("홍길동");	//	문자열 출력
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.5F);
			
			dos.writeUTF("임꺽정");	//	문자열 출력
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9F);
			
			dos.close();
			
			//	읽어오기
			//	주의: 저장된 순서대로 읽어 와야 한다
			InputStream is = new FileInputStream(filename);	//	주스트림
			DataInputStream dis = new DataInputStream(is);	//	보조 스트림
			
			for (int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s - %b:%d:%f%n", s, b, val, f);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
