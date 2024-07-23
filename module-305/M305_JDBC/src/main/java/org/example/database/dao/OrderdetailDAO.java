package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Orderdetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderdetailDAO {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void insert(Orderdetail orderdetail) {
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.save(orderdetail);

        session.getTransaction().commit();
        session.close();
    }
    public Orderdetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
        Session session = factory.openSession();

        String hql = "SELECT od FROM Orderdetail od where od.product.id = :productId and od.order.id = :orderId";

        TypedQuery<Orderdetail> query = session.createQuery(hql,Orderdetail.class);
        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);

        try {
            Orderdetail result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }//-----------------Method Update-----------------
    public void update(Orderdetail orderdetail) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(orderdetail); // only line that change
        session.getTransaction().commit();
        session.close();
    }

}
