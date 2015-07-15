package org.ernesto.app.baloncesto.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Inject;
import org.ernesto.app.baloncesto.dao.impl.TipoUserDao;
import org.ernesto.app.baloncesto.models.TipoUser;

/**
 *
 * @author neto
 */
public class TipoUsuarioBeans implements Serializable{
    
    private TipoUserDao dao;
    //@Inject 
    private TipoUser tuser;
    List<TipoUser> view = null;
    
    public TipoUsuarioBeans() {
    }

    public TipoUser getTuser() {
        return tuser;
    }

    
    @PostConstruct
    private void init(){
        dao = new TipoUserDao();
        tuser = new TipoUser();
    }
    
    public void setTuser(TipoUser tuser) {
        this.tuser = tuser;
    }

    public List<TipoUser> getView() {
        return (List<TipoUser>) dao.view();
    }

   
    public void add(){
        dao.add(tuser);
        tuser = new TipoUser();
    }
    

    
    
    
}
