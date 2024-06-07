package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customers;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductDAO {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

//------------------------Find By Id-----------------------------------------
    public Product findById(Integer id){
        Session session = factory.openSession();

        String hql = "SELECT p FROM Product p WHERE p.id = :xid";
        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("xid", id);

        try {
            Product result = query.getSingleResult();
            return result;
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }
    }
//-----------------------Method findByName----------------------------------------

    public List<Product> findByName(String productName){
        Session session = factory.openSession();

        //This uses the names of JAVA Class !!!!!!!
        String hql = "SELECT p FROM Product p WHERE p.productName = :pname";
        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("pname", productName);

        List<Product> products = query.getResultList();

        session.close();
        return products;

    }
    //--------------------Method findLikeName------------------------

    public List<Product> findLikeName(String productName){
        Session session = factory.openSession();

        //This uses the names of JAVA Class !!!!!!!
        String hql = "SELECT p FROM Product p WHERE p.productName like concat('%', :pname,'%')";
        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("pname", productName);

        List<Product> products = query.getResultList();

        session.close();
        return products;

    }

    //-------------------method update----------------------

    public void update(Product products) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(products);
        session.getTransaction().commit();
        session.close();
    }
}
