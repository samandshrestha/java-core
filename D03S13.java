package day3session1;

import java.util.HashSet;
class Products {
    private int productId;
    private String productName;
    public Products(int productId, String productName) {
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
public class D03S13 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();
        products.add(new Product(1, "Supra"));
        products.add(new Product(2, "GTR"));
        products.add(new Product(3, "Lambo"));
        products.add(new Product(4, "Camaro"));
        int searchId = 3; // Product ID to search
        Product searchedProduct = null;
        for (Product product : products) {
            if (product.getProductId() == searchId) {
                searchedProduct = product;
                break;
            }
        }
        if (searchedProduct != null) {
            System.out.println("Product found:");
            System.out.println(searchedProduct);
        } else {
            System.out.println("Product not found with ID: " + searchId);
        }
    }
}
