//WAP to print scheme, authority, path, section and query string(also known as parts of URL) of https://example.com/en/4.2/querysets/#queryset-api
package lab;

import java.net.URI;
import java.net.URISyntaxException;

public class Lab8 {
    public static void main(String[] args) { 
        try {
            String url = "https://example.com/en/4.2/querysets/#queryset-api";
            
            URI uri = new URI(url);
            
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Fragment (Section): " + uri.getFragment());
            System.out.println("Query String: " + uri.getQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
