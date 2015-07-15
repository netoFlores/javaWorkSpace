package org.ernesto.app.dao;

import java.util.List;
import org.ernesto.app.hibernateUtil.HibernateUtil;
import org.ernesto.app.model.Stock;
import org.hibernate.Query;
import org.hibernate.Session;


public class StockDao {
    private Session session = HibernateUtil.getSessionFactory().openSession();
    
    public List<Stock> listar(){
        List<Stock> lista = null;
        
        session.beginTransaction();
        String hql = "FROM Stock";
        Query query = session.createQuery(hql);
        lista = query.list();
        
        return lista;
    }
}
