package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.entity.Order;

import java.util.List;
import java.util.Scanner;

public class MainOrder {

    private OrderDAO orderDAO = new OrderDAO();
    private Scanner scanner = new Scanner(System.in);

//----- prompt for customerID---------------- step 1---------------

    public Integer promptForCustomerId() {
        System.out.println("Please enter a customer ID");
        Integer customerId = scanner.nextInt();
        return customerId; // will return an Integer
    }

    public void run() {
        Integer customerId2 = promptForCustomerId();
        List<Order> orders = orderDAO.findOrdersByCustomer_Id(customerId2);
         if(orders.isEmpty()){
             System.out.println("No order found for the given customer ID");
         } else {
             for (Order order: orders){
                 System.out.println(orders);
             }
         }

    }


    //---------------------- The Main Method-----------------------------------------------------//
    public static void main(String args[]) {
        MainOrder om = new MainOrder();
        om.run();
        System.out.println(om);
    }
}
