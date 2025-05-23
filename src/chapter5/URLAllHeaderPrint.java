//WAP to print all the headers present in a URL
package chapter5;

import java.io.*;
import java.net.*;

public class URLAllHeaderPrint {
	public static void main(String[] args) {
		String url= "http://www.fb.com";
		try {
			URL u = new URL(url);
			URLConnection uc = u.openConnection();
			for (int i = 1;; i++) {
				String header = uc.getHeaderField(i);
				if (header == null)
					break;  	
				System.out.println(uc.getHeaderFieldKey(i) + ": " + header);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}
}