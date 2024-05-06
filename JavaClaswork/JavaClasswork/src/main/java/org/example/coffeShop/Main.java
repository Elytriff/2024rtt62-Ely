package org.example.coffeShop;

import java.util.ArrayList;
import java.util.List;

public class MainCoffe {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product coffee = new Product();
        coffee.setPrice(5.45);
        coffee.setName("Small coffee");
        coffee.setBeverage(true);
        products.add(coffee);

        Product cakePop = new Product();
        coffee.setPrice(3.89);
        coffee.setName("cakePop");
        coffee.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false);
        products.add(eggSandwich);

    }
}
