package org.example.database;

import org.example.database.dao.OrderDAO;
import org.example.database.entity.Order;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainOrder {
    private OrderDAO orderDAO = new OrderDAO();
    private Scanner scanner = new Scanner(System.in);

//----- prompt for customerID---------------- step 1---------------

    public Integer promptForCustomerId() {
        while (true) {
            try {
                System.out.println("Please enter a customer ID");
                int customerId = scanner.nextInt();
                return customerId; // will return an Integer
            } catch (InputMismatchException e) {
                System.out.println("Invalid customer ID");
                scanner.next();
            }
        }
    }

    //---------------Prompt for order Id----------------------------

    public Integer promptForOrderId(){
        while (true){
            try{
                System.out.println("Please enter an order ID");
                int orderId = scanner.nextInt();
                return orderId;
            } catch (InputMismatchException e){
                System.out.println("Invalid order ID");
                scanner.next();
            }
        }
    }

    //---------------------- The run method-------------------------
    public void run() {
        // ------- printing the order by customer ID---
//        int customerId2 = promptForCustomerId();
//        List<Order> orders = orderDAO.findOrdersByCustomer_Id(customerId2);
//        if (orders.isEmpty()) {
//            System.out.println("No order found for the given customer ID");
//        } else {
//            for (Order order : orders) {
//                System.out.println(orders);
//            }
//        }

        //---------------- printing the order by order id------

        while (true){
            int orderId2 = promptForOrderId();
            Order order2 = orderDAO.findByOrderId(orderId2);
            if (order2 == null) {
                System.out.println("This order ID does not exist"); // probar este codigo
            } else {
                System.out.println("Order with ID: " + order2.getId() + order2);
                System.exit(0);
            }
        }
    }

    //---------------------- The Main Method-----------------------------------------------------//
    public static void main(String[] args) {
        MainOrder om = new MainOrder();
        om.run();
        om.scanner.close();
    }
}


