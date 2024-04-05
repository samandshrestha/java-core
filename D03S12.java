package day3session1;
import java.util.HashSet;

class Product {
    private int productId;
    private String productName;
    public Product(int productId, String productName) {
        this.productId = productId;
          this.productName = productName;
    }
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    @Override
    public String toString() {
        return "Product ID: " + productId + ", Product Name: " + productName;
    }
}
public class D03S12 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product(1, "Supra"));
        products.add(new Product(2, "GTR"));
        products.add(new Product(3, "Lambo"));
        products.add(new Product(4, "Camaro"));
        System.out.println("List of Product Details:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
