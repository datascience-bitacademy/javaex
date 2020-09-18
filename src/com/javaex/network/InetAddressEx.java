package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		//	내 아이피 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP Address:" + local.getHostAddress());
			
			//	Google.com의 IP확인
//			String domain = "www.google.com";
			String domain = "www.naver.com";
			
			InetAddress[] adrs = InetAddress.getAllByName(domain);
			
			for (InetAddress remote:adrs) {
				System.out.println(domain + " IP Address:" + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
