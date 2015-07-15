package org.ernesto.app.model.dao;

import org.ernesto.app.model.Cliente;
import org.ernesto.app.model.hibernateUtil.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDao {
   private Session session = HibernateUtil.getSessionFactory().openSession();

    public ClienteDao() {
    }
    
    public void save(Cliente cliente){
        session.save( cliente);
    }
    
    public void update(Cliente cliente){
        session.update(cliente);
    }
    
    public void delete(Cliente cliente){
        session.delete(cliente);
    }
    
    public java.util.List<Cliente> listar(){
        Query query = session.createQuery("FROM Usuario");
        return query.list();
    }
    
    public java.util.List<Cliente> buscar(Integer id){
        Query query = session.createQuery("FROM Cliente WHERE id = :id");
        query.setParameter("id", id);
        return query.list();
    } 
}
