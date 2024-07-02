package Ex4;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Keyboard", 120);
        Product product2 = new Product("Mouse", 100);
        Product product3 = new Product("Monitor", 500);

        System.out.println("Accessing product list directly: " + ProductManager.PRODUCTS);
        System.out.println("Adding products...");
        ProductManager.addProduct(product1);
        ProductManager.addProduct(product2);
        ProductManager.addProduct(product3);
        System.out.println("Products added!");
        ProductManager.printProducts();
    }
}
