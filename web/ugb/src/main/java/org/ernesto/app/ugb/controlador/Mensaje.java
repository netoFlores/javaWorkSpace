/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.ugb.controlador;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author neto
 */
@Named(value = "mensaje")
@RequestScoped
public class Mensaje {

    private String saludo;
    public Mensaje() {
        
    }
    
    @PostConstruct
    private void init(){
        this.setSaludo("Bienvenidos a la UGB");
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    
    
}
