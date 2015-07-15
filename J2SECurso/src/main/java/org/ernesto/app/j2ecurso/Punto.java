package org.ernesto.app.j2ecurso;

/**
 *
 * @author neto
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x_, int y_){
        x = x_;
        y = y_;
    }
    
    public Punto(){
        x = y = 0;
    }
    
    public int leerX(){
        return x;
    }
    
    public int leerY(){
        return y;
    }
    
    public void fijarX(int valorX){
        x = valorX;
    }
    
    public void fijarY(int valorY){
        y = valorY;
    }
    
    
}
