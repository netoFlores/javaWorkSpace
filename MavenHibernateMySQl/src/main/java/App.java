

import java.util.List;
import org.ernesto.app.mavenhibernatemysql.dao.StockDao;
import org.ernesto.app.model.Stock;
import org.hibernate.Session;
import org.ernesto.app.mavenhibernatemysql.hbutil.HibernateUtil;

public class App {
    public static void main(String[] args) {
        StockDao stockDao = new StockDao();
//        Stock stock;
//       
//        System.out.println("Maver + Hibernate");
//        stock = stockDao.buscar(1);
//        if (stock == null)
//            System.out.println("No se encontro..");
//        else{
//            System.out.println("Se encontro");
//            System.out.println(stock.getStockId());
//            System.out.println(stock.getStockCode());
//            System.out.println(stock.getStockName());
//        }
        
//        List<Stock> listado = stockDao.listar();
//        
//        for(Stock stock : listado){
//            System.out.println("Producto::::");
//            System.out.println(stock.getStockId());
//            System.out.println(stock.getStockCode());
//            System.out.println(stock.getStockName());
//            
//        }
        
        Stock stock = stockDao.buscar("4715");
        System.out.println("Se encontro");
        System.out.println(stock.getStockId());
        System.out.println(stock.getStockCode());
        System.out.println(stock.getStockName());
        
    }
}
