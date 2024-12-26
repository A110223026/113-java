package main.interfaces;

import models.Product;

public class ProductManagement {
        void addProduct(Product product);
        void removeProduct(int productId);
        Product searchProductByName(String name);
}
