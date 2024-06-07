package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDAO {

    //--------------------------------------- Method insert--------------
    public void insert(Employee employee) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(employee);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();
    }

    //-------------method 1----------------------------
    public List<Employee> findByFirstName(String firstName) {

        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different from regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT e FROM Employee e where e.firstname = :xfirstname";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
// this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("xfirstname", firstName);

        // when we know we are getting 0 or more records we use getResultList
        List<Employee> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }

    //-----------------Method 2---------------------------
    public List<Employee> findByLastName(String lastName) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.lastname = ?"
        String hql = "SELECT e FROM Employee e where e.lastname = :lastname";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Employee> query = session.createQuery(hql,Employee.class);

        // this is similar to the prepared statement, we are going to set the value in the query :lastname
        // to the value passed into the function
        query.setParameter("lastname", lastName);

        // when we know we are getting 0 or more records we use getResultList
        List<Employee> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }

    //--------------------Method 3--------------------
    public Employee findEmployeeById(Integer id) {

        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different from regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT e FROM Employee e where e.id = :xid";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
// this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("xid", id);

        // we are querying a PK so the result can be found or not
        //this implementation will throw an exception in codes 2010 and under if the record is not found, so we put a
        // try-catch
        try {
            Employee result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    //-----------------Method 4-----------------
    public void update(Employee employee) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(employee); // only line that change
        session.getTransaction().commit();
        session.close();
    }
}
