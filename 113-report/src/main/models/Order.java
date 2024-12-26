package main.models;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private Date date;
    private ArrayList<Product> products;

    public Order(int orderId, ArrayList<Product> products) {
        this.orderId = orderId;
        this.date = new Date();
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}