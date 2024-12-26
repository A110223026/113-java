package main.models;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Product> shoppingCart; // 購物車

    // 建構子
    public Customer(String username, String email) {
        super(username, email); // 呼叫父類別的建構子
        this.shoppingCart = new ArrayList<>();
    }
}

    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }

    // 檢視購物車內容
    public void viewCart() {
        System.out.println("Your shopping cart contains:");
        for (Product product : shoppingCart) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }

    // 覆寫抽象方法
    @Override
    public void displayInfo() {
        System.out.println("Customer Username: " + username + ", Email: " + email);
    }
