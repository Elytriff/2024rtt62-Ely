package org.example.database.dao.Orderdetails;

import org.example.database.entity.Orderdetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAO {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();


    void insert(Orderdetail orderDetail) {
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.save(orderDetail);

        session.getTransaction().commit();
        session.close();
    }
}
