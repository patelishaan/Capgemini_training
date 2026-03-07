package ProductInventoryManagement.model;

import java.sql.Timestamp;

public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;
    private double rating;
    private Timestamp createdAt;

    public Product() {}

    public Product(int productId, String productName, String category,
                   double price, int quantity, double rating) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
    }

    // Getters and Setters
    public int getProductId()              { return productId; }
    public void setProductId(int id)       { this.productId = id; }

    public String getProductName()                  { return productName; }
    public void setProductName(String productName)  { this.productName = productName; }

    public String getCategory()                { return category; }
    public void setCategory(String category)   { this.category = category; }

    public double getPrice()           { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity()               { return quantity; }
    public void setQuantity(int quantity)  { this.quantity = quantity; }

    public double getRating()            { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public Timestamp getCreatedAt()                { return createdAt; }
    public void setCreatedAt(Timestamp createdAt)  { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-10.2f %-5d %.1f",
                productId, productName, category, price, quantity, rating);
    }
}