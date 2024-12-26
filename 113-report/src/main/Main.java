package main;

import models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@example.com");
        customer.displayInfo();

        Product product1 = new Product("T-Shirt", 20.5, "Clothing");
        Product product2 = new Product("Jeans", 40.0, "Clothing");
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.viewCart();

        // 建立管理員物件
        Admin admin = new Admin("Bob", "bob@example.com");
        admin.setAdminLevel(2);
        admin.displayInfo();
    }
}

