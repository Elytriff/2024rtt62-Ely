package org.example.database.dao;

import org.example.database.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerDAOTest {
    private CustomersDAO customersDAO = new CustomersDAO();

    @Test
    public void findByIdTest(){
        // Given
        Integer userId = 103;
        // when
        Customer customer = customersDAO.findCustomerById(userId);
        // then
        Assertions.assertNotNull(customer);
        Assertions.assertEquals(userId, customer.getId());
        Assertions.assertEquals("Atelier graphique", customer.getCustomerName());
        //the expected value is the first argument
       // Assertions.assertEquals("asdf", customer.getContactLastname()); // this going to fail

    }

    @Test
    public void findByInvalidIdTest() {
        // Given
        Integer userId = 103033;
        // when
        Customer customer = customersDAO.findCustomerById(userId);
        // then
        Assertions.assertNull(customer);
    }

}
