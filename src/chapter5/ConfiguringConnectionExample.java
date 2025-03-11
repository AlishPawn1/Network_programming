package chapter5;

import java.net.URL;
import java.net.URLConnection;

public class ConfiguringConnectionExample {

	
	public static void main(String[] args) {
		try {
			URL url = new URL("example.com");
			
			URLConnection connection = url.openConnection();
			
			System.out.println("Url: " + connection.getURL());
			System.out.println("Allow User Interaction" + connection.getAllowUserInteraction());
			System.out.println("Do output" + connection.getDoOutput());
			System.out.println("use case" + connection.getUseCaches());
			
//			configure the URLConnection
			connection.setAllowUserInteraction(true);
			connection.setDoOutput(true);
			connection.setUseCaches(true);
			
			System.out.println("After ");
			System.out.println("Allow User Interaction" + connection.getAllowUserInteraction());
			System.out.println("Do output" + connection.getDoOutput());
			System.out.println("use case" + connection.getUseCaches());
			
		}catch(Exception e) {
			
		}
	}
	
}
