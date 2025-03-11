package chapter3;

import java.net.URL;

public class UrlConnectionMethod2 {
    public static void main(String[] args) {
        try {
           
            URL uri = new URL("https", "example.com", "//path?query=value#fragment");

            System.out.println("Scheme: " + uri.getProtocol());
            System.out.println("Host: " + uri.getHost()); 
            System.out.println("Scheme Specific Part: " + uri.getFile());
            System.out.println("Fragment: " + uri.getRef());
        }
        
        catch (Exception e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
