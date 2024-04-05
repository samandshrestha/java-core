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
    @Override
    public int hashCode() {
        return productId;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return productId == other.productId;
    }
}
public class D03S14 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product(1, "Sun"));
        products.add(new Product(2, "Moon"));
        products.add(new Product(3, "Earth"));
        products.add(new Product(4, "Venus"));
        int removeId = 3; // Product ID to remove
        Product toRemove = null;
        for (Product product : products) {
            if (product.getProductId() == removeId) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product with ID " + removeId + " not found.");
        }
        System.out.println("Products after removal:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

