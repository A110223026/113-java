package main.interfaces;

import models.Order;
import models.Product;
import java.util.LinkedList;

public class OrderManagement {
    void placeOrder(Order order);
    void cancelOrder(int orderId);
    LinkedList<Order> getOrderHistory();
}
