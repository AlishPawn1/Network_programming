//WAP to print the IP address and MAC address of any host.

package lab;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;

public class Lab7 {
	public static void main(String[] args) {
		try {
            URL url = new URL("https://www.google.com");
            
            String host = url.getHost();
            InetAddress ip = InetAddress.getByName(host);
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
		
		try {
            NetworkInterface networkInterface = NetworkInterface.getNetworkInterfaces().nextElement();
            byte[] mac = networkInterface.getHardwareAddress();
//            System.out.println(mac);	
            
            if (mac != null) {
                StringBuilder macAddress = new StringBuilder();
                for (byte b : mac) {
                    macAddress.append(String.format("%02X:", b));
                }
                macAddress.setLength(macAddress.length() - 1);
                System.out.println("MAC Address: " + macAddress.toString());
            } else {
                System.out.println("MAC Address not found.");
            }
        } catch (Exception e) {
            System.out.println("Error retrieving MAC address: " + e.getMessage());
        }
	}
}
