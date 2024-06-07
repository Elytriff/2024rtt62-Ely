package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customers;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDAO {
//------------------method findById--------------------

    public Order findByOrderId(Integer id) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "SELECT o FROM Order o where o.id = :xid";
        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("xid", id);

        // we are querying a PK so the result can be found or not
        //this implementation will throw an exception in codes 2010 and under if the record is not found, so we put a
        // try-catch
        try {
            Order result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }
    //-----------------------------Find by Customer_Id---------------

    public Order findByCustomer_Id(Integer customer_id){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql2 = "SELECT o FROM Order o where o.customer_id = :xcustomer_id";
        TypedQuery<Order> query2 = session.createQuery(hql2, Order.class);
        query2.setParameter("xcustomer_id", customer_id);

        try {
            Order result2 = query2.getSingleResult();
            return result2;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }
}
