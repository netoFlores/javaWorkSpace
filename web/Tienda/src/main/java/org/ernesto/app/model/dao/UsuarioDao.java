package org.ernesto.app.model.dao;

import org.ernesto.app.model.hibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.ernesto.app.model.Usuario;
import org.hibernate.Query;

public class UsuarioDao {

    private Session session = HibernateUtil.getSessionFactory().openSession();

    public UsuarioDao() {
    }

    public void save(Usuario usuario) {
        try {
            session.beginTransaction().begin();
            session.save(usuario);
            session.beginTransaction().commit();
        } catch (Exception e) {
            session.beginTransaction().rollback();
        }

    }

    public void update(Usuario usuario) {
        session.update(usuario);
    }

    public void delete(Usuario usuario) {
        session.delete(usuario);
    }

    public java.util.List<Usuario> listar() {
        Query query = session.createQuery("FROM Usuario");
        java.util.List<Usuario> lista = query.list();
        return lista;
    }

    public java.util.List<Usuario> buscar(Integer id) {
        Query query = session.createQuery("FROM Usuario WHERE id = :id");
        query.setParameter("id", id);
        return query.list();
    }
}
