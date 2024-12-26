package main;

import main.models.*;
import main.services.*;
import main.exceptions.OutOfStockException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        Customer customer = new Customer("Alice", "alice@example.com");
        Admin admin = new Admin("Bob", "bob@example.com");
        userManagement.addUser(Customer);
        userManagement.addUser(Admin);
        userManagement.listUsers();

        // 商品管理
        Product product1 = new Product("T-Shirt", 20.0, "Clothing", 10);
        Product product2 = new Product("Jeans", 50.0, "Clothing", 5);
        product1.applyDiscount(10);

        System.out.println("Final price of T-Shirt: " + product1.getFinalPrice());

        // 購物流程
        try {
            customer.addToCart(product1);
            customer.addToCart(product2);
            customer.viewCart();
            product1.decreaseStock(2);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        // 訂單管理
        ArrayList<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);
        Order order = new Order(1, orderProducts);
        order.updateStatus("Completed");
        System.out.println("Order Status: " + order.getStatus());
    }
}

