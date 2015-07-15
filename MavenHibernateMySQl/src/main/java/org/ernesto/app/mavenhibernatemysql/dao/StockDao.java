package org.ernesto.app.mavenhibernatemysql.dao;

import java.util.List;
import org.ernesto.app.mavenhibernatemysql.hbutil.HibernateUtil;
import org.ernesto.app.model.Stock;
import org.hibernate.Query;
import org.hibernate.Session;

public class StockDao {
    private Session session = HibernateUtil.getSessionFactory().openSession();
    
    public StockDao() {
    }
    
    public void save(Stock stock){
        session.beginTransaction();
        session.save(stock);
        session.getTransaction().commit();
    }
    
    public void update(Stock stock){
        session.beginTransaction();
        session.update(stock);
        session.getTransaction().commit();
    }
    
    public void delete(Stock stock){
        session.beginTransaction();
        session.delete(stock);
        session.getTransaction().commit();
    }
    
    public Stock buscar(String code){
        Stock stock = null;
        session.beginTransaction();
        Query query = session.createQuery("FROM Stock WHERE stockCode = :code");
        query.setParameter("code", code);
        List stocks =  query.list();
        
        if(stocks != null){
            for(Object lista : stocks){
                stock = (Stock)lista;
            }
        }
        
        session.getTransaction().commit();
        
        return stock;
    }
    
    public List<Stock> listar(){
        List<Stock> productos = null;
        session.beginTransaction();
        Query query = session.createQuery("FROM Stock");
        productos = query.list();
        
        return productos;
    }
}
