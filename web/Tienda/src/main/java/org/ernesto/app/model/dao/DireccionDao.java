package org.ernesto.app.model.dao;

import org.ernesto.app.model.Direccion;
import org.ernesto.app.model.hibernateUtil.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class DireccionDao {
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public DireccionDao() {
    }
    
    public void save(Direccion direccion){
        session.save( direccion);
    }
    
    public void update(Direccion direccion){
        session.update(direccion);
    }
    
    public void delete(Direccion direccion){
        session.delete(direccion);
    }
    
    public java.util.List<Direccion> listar(){
        Query query = session.createQuery("FROM Usuario");
        return query.list();
    }
    
    public java.util.List<Direccion> buscar(Integer id){
        Query query = session.createQuery("FROM Direccion WHERE id = :id");
        query.setParameter("id", id);
        return query.list();
    }
}
