package Ex4;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static final List<Product> PRODUCTS = new ArrayList<>();

    public static void addProduct(Product product) {
        PRODUCTS.add(product);
    }

    public static void removeProduct(Product product) {
        PRODUCTS.remove(product);
    }

    public static void printProducts() {
        PRODUCTS.forEach(System.out::println);
    }
}
