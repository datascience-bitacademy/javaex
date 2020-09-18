package com.javaex.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		//	서버 소켓
		ServerSocket serverSocket = null;
		
		try {
			//	바인드 : 주소, 포트 연결
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local); 
			
			System.out.println("<서버 시작>");
			System.out.println("[서버: 연결을 기다립니다.]");
						
			//	대기 및 통신용 소켓 얻어오기
			Socket socket = serverSocket.accept(); //	대기 상태
			
			
			
			// --- 서버 쓰레드가 담당해야 할 부분
			//	클라이언트 접속시 처리
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			
			System.out.println("[서버: 클라이언트가 연결되었습니다.]");
			System.out.println("접속 클라이언트 정보:" + socketAddress.getAddress() 
													+ ":" + socketAddress.getPort());
			//	메시지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8"); //	UTF-8 읽기
			BufferedReader br = new BufferedReader(isr);
			
			//	출력용 Stream 파이프
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	메시지 읽고 Echo Back
			while(true) {
				String msg = br.readLine();
				
				if (msg == null) {
					//	접속 종료
					System.out.println("[서버: 클라이언트 접속이 종료되었습니다]");
					break;
				}
				
				System.out.println("[서버: 전송된 메시지] " + msg);
				//	Echo Back
				System.out.println("[서버: Echo Back]");
				bw.write("[Echo Message] " + msg);
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			br.close();
			
			System.out.println("<서버 종료>");
			//	---- 쓰레드 담당 코드
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//	소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				
			}
		}
	}

}
