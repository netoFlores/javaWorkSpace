package org.ernesto.app.hibernatemysql;

import org.ernesto.app.dao.HibernateUtil;
import org.ernesto.app.models.Stock;
import org.hibernate.Session;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        session.getTransaction().commit();
                
    }
}
