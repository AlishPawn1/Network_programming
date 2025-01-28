package chapter2;

import java.net.InetAddress;

public class GetByName {
	
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.github.com");
			System.out.println(ip);
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("Ip Address: " + ip.getHostAddress());
			System.out.println("Conoical Host Name: " + ip.getCanonicalHostName());
			
//			System.out.println("is any local address: " + ip.isAnyLocalAddress());
//			System.out.println("Is loop back address: " + ip.isLoopbackAddress());
//			System.out.println("is link local address: " + ip.isLinkLocalAddress());
//			System.out.println("Is site local adddress: " + ip.isSiteLocalAddress());
//			System.out.println("Is muticast address: " + ip.isMulticastAddress());
//			System.out.println("is multicast local: " + ip.isMCSiteLocal());
//			System.out.println("is multicast org: " + ip.isMCOrgLocal());
//			System.out.println("is multicast link local: " + ip.isMCLinkLocal());
//			System.out.println("is multicast node local: " + ip.isMCNodeLocal());
		}
		catch(Exception e) {System.out.println(e);}
	}

}
