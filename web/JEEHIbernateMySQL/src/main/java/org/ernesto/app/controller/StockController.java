package org.ernesto.app.controller;

import org.ernesto.app.dao.StockDao;
import org.ernesto.app.model.Stock;
import java.util.List;

public class StockController {

    private StockDao dao = new StockDao(); 
    private Stock stock;
    public StockController() {
    }
    
    public List<Stock> lista(){
        return dao.listar();
    }
    
}
