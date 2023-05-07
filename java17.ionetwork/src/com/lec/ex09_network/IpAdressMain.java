package com.lec.ex09_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAdressMain {

	public static void main(String[] args) throws Exception {
		
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("Local IP Address" + ip.getHostAddress());
		System.out.println("Local IP Name" + ip.getHostName());
		System.out.println();
		
		
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ip1:ips) {
			System.out.println("Naver IP = " + ip1.getHostAddress());
		}
		System.out.println();
		
		ips = InetAddress.getAllByName("www.daum.net");
		for(InetAddress ip1:ips) {
			System.out.println("Daum IP = " + ip1.getHostAddress());
		}
		System.out.println();
		
		ips = InetAddress.getAllByName("www.google.com");
		for(InetAddress ip1:ips) {
			System.out.println("google IP = " + ip1.getHostAddress());
		}
		System.out.println();
		
		
	}

}
