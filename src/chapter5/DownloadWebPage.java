package chapter5;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class DownloadWebPage {
	public static <URLconnection> void main(String[] args ) {
		try {
			URL url = new URL("https://facebook.com");
	        URLConnection connection = url.openConnection();
	        InputStream raw = connection.getInputStream();
	        InputStream buffer = new BufferedInputStream(raw);
	        Reader reader = new InputStreamReader(buffer);
	        int c;
	        while ((c = reader.read()) != -1) {
	            System.out.print((char) c);
	        }
	        reader.close();
			
		}catch(Exception e) {
			
		}
	}
}
