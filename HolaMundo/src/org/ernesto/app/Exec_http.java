
package org.ernesto.app;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Exec_http {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String dest = "http://";
        
        if(args.length <= 0){
            System.out.println("Usage: Exec_http page [args]");
            System.exit(1);
        }else{
            dest += args[0];
            for(int k = 1; k < args.length; k++ ){
                dest += ((k == 1) ? "?" : "&" ) + args[k];
            }
        }
        
        System.out.println(dest);
        URL url = new URL(dest);
        Object obj = url.getContent();
        InputStream resp = (InputStream) obj;
        byte[] b = new byte[256];
        int n = resp.read(b);
        while(n != -1){
            System.out.println(new String(b, 0, n));
            n = resp.read(b);
        }
    }
}
