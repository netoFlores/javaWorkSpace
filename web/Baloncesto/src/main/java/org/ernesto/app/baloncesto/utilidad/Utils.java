package org.ernesto.app.baloncesto.utilidad;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class Utils {
  
    public static void session(String name, Object object){
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        request.getSession().setAttribute(name, object);
    }
    
    public static void closeSession(String name){
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        request.getSession().removeAttribute(name);
        
    }
    
    public static void faceMessage(String summary, String detail){
        FacesMessage ms = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, ms);
        
    }
    
    public static String md5(String cadena) throws NoSuchAlgorithmException{
        String outcome = ""; 
        
        if(!cadena.equals("")){
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(cadena.getBytes());
            byte[] digest = md5.digest();
            StringBuilder sb = new StringBuilder();
            for(byte b : digest){
                sb.append(String.format("%02x", b & 0xff));
            }
            
            outcome = sb.toString();
            
        }
        
        
        return outcome;
    }
}
