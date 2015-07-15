/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author neto
 */
public class MD5 {
    private String hash;

    public MD5() {
    }

    public MD5(String cadena) throws NoSuchAlgorithmException {
        this.crearHash(cadena);
    }
    
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    public String crearHash(String cadena) throws NoSuchAlgorithmException{
        if(!cadena.equals("")){
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(cadena.getBytes());
            byte[] digest = md5.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            this.setHash(sb.toString());
        }
        
        return hash;
    }
    
}
