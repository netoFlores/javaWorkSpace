/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.ernesto.app.hellowordspring.models.Usuario;
import org.ernesto.app.hellowordspring.spring.DAOUsuario;
import org.ernesto.app.hellowordspring.spring.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author neto
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        Usuario  usuario = new Usuario();
        usuario.setNombre("Sonia");
        usuario.setApellido("Turcio");
        usuario.setEmail("st@gmail.com");
        usuario.setClave("1234");
        
        DAOUsuario obj = (DAOUsuario) context.getBean("usuarioBean");
        //obj.add(usuario);
        
        
        usuario.setNombre("ana");
        usuario.setApellido("Gilma");
        usuario.setEmail("ag@gg.com");
        usuario.setClave("123d");
        
        obj.llamarProcedimiento(usuario);
    }
}
