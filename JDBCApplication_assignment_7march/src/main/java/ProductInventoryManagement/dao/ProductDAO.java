package ProductInventoryManagement.dao;

import ProductInventoryManagement.model.Product;
import ProductInventoryManagement.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    // ─────────────────────────────────────────────
    // Task 1 — Add Product
    // ─────────────────────────────────────────────
    public boolean addProduct(Product product) {
        // Validate before hitting the DB
        if (product.getPrice() <= 0) {
            System.out.println("Error: Price must be greater than 0.");
            return false;
        }
        if (product.getQuantity() < 0) {
            System.out.println("Error: Quantity cannot be negative.");
            return false;
        }
        if (product.getRating() < 1 || product.getRating() > 5) {
            System.out.println("Error: Rating must be between 1 and 5.");
            return false;
        }

        String sql = "INSERT INTO products (product_id, product_name, category, price, quantity, rating) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt   (1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getCategory());
            ps.setDouble(4, product.getPrice());
            ps.setInt   (5, product.getQuantity());
            ps.setDouble(6, product.getRating());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Product added successfully!");
                return true;
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error: Product ID already exists.");
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return false;
    }

    // ─────────────────────────────────────────────
    // Task 2 — View All Products
    // ─────────────────────────────────────────────
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products ORDER BY product_id";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(mapRow(rs));
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return list;
    }

    // ─────────────────────────────────────────────
    // Task 3 — View Product By ID
    // ─────────────────────────────────────────────
    public Product getProductById(int id) {
        String sql = "SELECT * FROM products WHERE product_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapRow(rs);
                }
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return null;
    }

    // ─────────────────────────────────────────────
    // Task 4 — Update Product Price
    // ─────────────────────────────────────────────
    public boolean updatePrice(int id, double newPrice) {
        if (newPrice <= 0) {
            System.out.println("Error: Price must be greater than 0.");
            return false;
        }

        String sql = "UPDATE products SET price = ? WHERE product_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newPrice);
            ps.setInt   (2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Price updated successfully.");
                return true;
            } else {
                System.out.println("Product not found.");
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return false;
    }

    // ─────────────────────────────────────────────
    // Task 5 — Update Product Quantity
    // ─────────────────────────────────────────────
    public boolean updateQuantity(int id, int newQty) {
        if (newQty < 0) {
            System.out.println("Error: Quantity cannot be negative.");
            return false;
        }

        String sql = "UPDATE products SET quantity = ? WHERE product_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, newQty);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Quantity updated successfully.");
                return true;
            } else {
                System.out.println("Product not found.");
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return false;
    }

    // ─────────────────────────────────────────────
    // Task 6 — Delete Product
    // ─────────────────────────────────────────────
    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE product_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Product deleted successfully.");
                return true;
            } else {
                System.out.println("Product does not exist.");
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return false;
    }

    // ─────────────────────────────────────────────
    // Task 7 — Search Product By Name (LIKE)
    // ─────────────────────────────────────────────
    public List<Product> searchByName(String keyword) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE product_name LIKE ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(mapRow(rs));
                }
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return list;
    }

    // ─────────────────────────────────────────────
    // Task 8 — Low Stock Alert (quantity < 5)
    // ─────────────────────────────────────────────
    public List<Product> getLowStockProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE quantity < 5 ORDER BY quantity";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(mapRow(rs));
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return list;
    }

    // ─────────────────────────────────────────────
    // BONUS 1 — Sort Products By Price
    // ─────────────────────────────────────────────
    public List<Product> getProductsSortedByPrice() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products ORDER BY price ASC";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) list.add(mapRow(rs));

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return list;
    }

    // ─────────────────────────────────────────────
    // BONUS 2 — Top Rated Products (rating >= 4.5)
    // ─────────────────────────────────────────────
    public List<Product> getTopRatedProducts() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE rating >= 4.5 ORDER BY rating DESC";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            while (rs.next()) list.add(mapRow(rs));

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return list;
    }

    // ─────────────────────────────────────────────
    // BONUS 3 — Total Inventory Value SUM(price*qty)
    // ─────────────────────────────────────────────
    public double getTotalInventoryValue() {
        String sql = "SELECT SUM(price * quantity) AS total_value FROM products";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)) {

            if (rs.next()) {
                return rs.getDouble("total_value");
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return 0.0;
    }

    // ─────────────────────────────────────────────
    // Helper — Map ResultSet row → Product object
    // ─────────────────────────────────────────────
    private Product mapRow(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setProductId  (rs.getInt   ("product_id"));
        p.setProductName(rs.getString("product_name"));
        p.setCategory   (rs.getString("category"));
        p.setPrice      (rs.getDouble("price"));
        p.setQuantity   (rs.getInt   ("quantity"));
        p.setRating     (rs.getDouble("rating"));
        p.setCreatedAt  (rs.getTimestamp("created_at"));
        return p;
    }
}