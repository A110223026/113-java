package main.models;

public class Product {
    private static int counter = 0;
    private int id;
    private String name;
    private double price;
    private String category;
    private int stock; // 庫存
    private double discount;

    public Product(String name, double price, String category, int stock) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative.");
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.discount = 0;
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
    public double getFinalPrice() {
        return price * (1 - discount / 100);
    }

    public void applyDiscount(double discount) {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");
        }
        this.discount = discount;
    }

    public void decreaseStock(int amount) throws Exception {
        if (amount > stock) {
            throw new Exception("Not enough stock available.");
        }
        this.stock -= amount;
    }

    // Getter methods...
}