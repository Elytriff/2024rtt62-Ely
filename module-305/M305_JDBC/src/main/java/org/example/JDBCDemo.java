package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "Cacac@cmysq1";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection(dburl, user, password);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of employee");
            String input = scanner.nextLine();

            String selectSQL = "Select * FROM employees where firstname = ?";
            //Statement stmt = connection.createStatement();
            PreparedStatement stmt = connection.prepareStatement(selectSQL);
            stmt.setString(1, input);

            ResultSet result =  stmt.executeQuery();

            while(result.next()) {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
