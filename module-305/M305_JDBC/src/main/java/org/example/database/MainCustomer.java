package org.example.database;

import org.example.database.dao.CustomersDAO;
import org.example.database.entity.Customers;

public class MainCustomer {
    public static void main(String args[]){

//--------------------- exercise 3--------------------------
        CustomersDAO customersDAO = new CustomersDAO();
        Customers newCustomer = new Customers();
//
        newCustomer.setAddressLine1("74 West");
        newCustomer.setCity("Miami");
        newCustomer.setContactFirstname("Pedro");
        newCustomer.setContactLastname("Sotolongo");
        newCustomer.setCountry("USA");
        newCustomer.setCustomerName("Pedro");
        newCustomer.setCreditLimit(20000.00);
        newCustomer.setPhone("3056784420");
        newCustomer.setSalesRepEmployeeId(1165);
        newCustomer.setState("Florida");
        newCustomer.setPostalCode("33013");

        customersDAO.insert(newCustomer);
        System.out.println(newCustomer);


        //-------------------------- exercise 4------------------------
  //      Customers newCustomer2 = customersDAO.findCustomerById(525);
//        //System.out.println(newCustomer2);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Firstname");
//        String input = scanner.nextLine();
//        newCustomer2.setContactFirstname("\"" + input + "\"");
//
//        System.out.println("Enter Lastname");
//        String input2 = scanner.nextLine();
//        newCustomer2.setContactLastname("\"" + input2 + "\"");
//
//        customersDAO.update(newCustomer2);
//        System.out.println(newCustomer2);
//
//        scanner.close();
   }
}
