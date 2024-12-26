package main.interfaces;

import models.Order;
import models.Product;
import java.util.LinkedList;

public class ProductManagement {
        void addProduct(Product product);
        void removeProduct(int productId);
        Product searchProductByName(String name);
}
