package org.ernesto.app.baloncesto.dao;

import java.util.List;

/**
 *
 * @author neto
 */
public interface FacadeDao {
    public void add(Object obt);
    public void update(Object obt);
    public void delete(Object obt);
    public Object findById(Object obt);
    public Object view();
}
