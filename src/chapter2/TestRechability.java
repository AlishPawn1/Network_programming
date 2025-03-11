package chapter2;

import java.net.InetAddress;

public class TestRechability {
    
    public static void main(String[] args) {
        
        try {
            // Check if website is reachable with a timeout of 5 seconds
            boolean isWebsiteReachable = InetAddress.getByName("www.esewa.com").isReachable(5000);
            System.out.println("Is Google reachable? " + isWebsiteReachable);
            
            // Check if host is reachable with a custom TTL and timeout
            boolean isHostReachable = InetAddress.getByName("esewa.com").isReachable(null, 1, 10);
            System.out.println("Is localhost reachable? " + isHostReachable);
            
//            time out affect the return value it check time if it reach in that time.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}