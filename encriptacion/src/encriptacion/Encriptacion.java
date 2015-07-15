/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

/**
 *
 * @author neto
 */
public class Encriptacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Mario";
        try {
            MD5 md5 = new MD5();
            System.out.println(cadena + ":"+md5.crearHash(cadena));
        } catch (Exception e) {
        }
        
        
    }
    
}
