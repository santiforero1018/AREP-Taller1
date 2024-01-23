package edu.escuelaing.arem.ASE.app;

import java.net.MalformedURLException;
import java.net.URL;

public class URLParser {
    public static void main(String[] args) throws MalformedURLException{
        URL myURL = new URL("https://google.com:8080/milibro.pdf?miID=2#example");
        System.out.println("host: "+ myURL.getHost());
        System.out.println("Authority: "+ myURL.getAuthority());
        System.out.println("Path: "+ myURL.getPath());
        System.out.println("Protocol: "+ myURL.getProtocol());
        System.out.println("Port: "+ myURL.getPort());
        System.out.println("Query: "+ myURL.getQuery());
        System.out.println("Ref.: "+ myURL.getRef());
        System.out.println("File: "+ myURL.getFile());
    }
}
