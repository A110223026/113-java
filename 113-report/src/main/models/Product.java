package main.models;

public class Product {
    private static int counter = 0;
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.category = category;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
