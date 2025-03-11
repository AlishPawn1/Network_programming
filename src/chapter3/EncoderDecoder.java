package chapter3;

import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class EncoderDecoder {
    public static void main(String[] args) {
        try {
            String uri = "https://www.example.com/search?q=hello world";

            // Encode the URL
            String encodedUrl = URLEncoder.encode(uri, StandardCharsets.UTF_8.toString());
            System.out.println("Encoded URL: " + encodedUrl);

            // Decode the URL
            String decodedUrl = URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8.toString());
            System.out.println("Decoded URL: " + decodedUrl);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
