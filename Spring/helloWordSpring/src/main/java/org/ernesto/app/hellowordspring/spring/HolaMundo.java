/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.hellowordspring.spring;

/**
 *
 * @author neto
 */
public class HolaMundo {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void printHello(){
        System.out.println("Hola " + name);
    }
}
