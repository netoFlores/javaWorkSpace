/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.ugbclass.controlador;

import javax.annotation.PostConstruct;

/**
 *
 * @author neto
 */
public class Saludo {
    private String saludo;
    
    @PostConstruct
    private void init(){
        this.setSaludo("Bienvenidos a la UGB.");
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    
}
