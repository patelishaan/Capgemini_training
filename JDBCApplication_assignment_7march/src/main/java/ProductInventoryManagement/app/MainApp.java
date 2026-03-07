package ProductInventoryManagement.app;

import ProductInventoryManagement.dao.ProductDAO;
import ProductInventoryManagement.model.Product;
import ProductInventoryManagement.util.DBConnection;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    private static final ProductDAO dao     = new ProductDAO();
    private static final Scanner    scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Connecting to database...");

        boolean running = true;

        while (running) {
            printMenu();

            int choice = -1;
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1-9.");
                scanner.nextLine(); // flush bad input
                continue;
            }

            switch (choice) {

                case 1 -> addProduct();
                case 2 -> viewAllProducts();
                case 3 -> viewProductById();
                case 4 -> updatePrice();
                case 5 -> updateQuantity();
                case 6 -> deleteProduct();
                case 7 -> searchByName();
                case 8 -> showLowStock();
                case 9 -> {
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                }

                // ── Bonus options (accessible by typing 10/11/12) ──
                case 10 -> sortByPrice();
                case 11 -> topRatedProducts();
                case 12 -> totalInventoryValue();

                default -> System.out.println("Invalid choice. Please select 1-9.");
            }

            System.out.println(); // blank line between operations
        }

        DBConnection.closeConnection();
        scanner.close();
    }

    // ─────────────────────────────────────────────
    // Menu Display
    // ─────────────────────────────────────────────
    private static void printMenu() {
        System.out.println("===== PRODUCT INVENTORY MENU =====");
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. View Product By ID");
        System.out.println("4. Update Product Price");
        System.out.println("5. Update Product Quantity");
        System.out.println("6. Delete Product");
        System.out.println("7. Search Product By Name");
        System.out.println("8. Show Low Stock Products");
        System.out.println("9. Exit");
        System.out.println("--- Bonus ---");
        System.out.println("10. Sort Products By Price");
        System.out.println("11. Top Rated Products");
        System.out.println("12. Total Inventory Value");
        System.out.println("==================================");
    }

    // ─────────────────────────────────────────────
    // Task 1 — Add Product
    // ─────────────────────────────────────────────
    private static void addProduct() {
        System.out.println("\n--- Add New Product ---");
        try {
            System.out.print("Product ID   : ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Product Name : ");
            String name = scanner.nextLine().trim();

            System.out.print("Category     : ");
            String category = scanner.nextLine().trim();

            System.out.print("Price        : ");
            double price = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Quantity     : ");
            int qty = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Rating (1-5) : ");
            double rating = Double.parseDouble(scanner.nextLine().trim());

            Product product = new Product(id, name, category, price, qty, rating);
            dao.addProduct(product);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }

    // ─────────────────────────────────────────────
    // Task 2 — View All Products
    // ─────────────────────────────────────────────
    private static void viewAllProducts() {
        System.out.println("\n--- All Products ---");
        List<Product> products = dao.getAllProducts();

        if (products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        printHeader();
        products.forEach(p -> System.out.println(p));
    }

    // ─────────────────────────────────────────────
    // Task 3 — View Product By ID
    // ─────────────────────────────────────────────
    private static void viewProductById() {
        System.out.println("\n--- View Product By ID ---");
        try {
            System.out.print("Enter Product ID: ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            Product p = dao.getProductById(id);
            if (p != null) {
                printHeader();
                System.out.println(p);
            } else {
                System.out.println("Product not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid ID format.");
        }
    }

    // ─────────────────────────────────────────────
    // Task 4 — Update Product Price
    // ─────────────────────────────────────────────
    private static void updatePrice() {
        System.out.println("\n--- Update Product Price ---");
        try {
            System.out.print("Enter Product ID : ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter New Price  : ");
            double price = Double.parseDouble(scanner.nextLine().trim());

            dao.updatePrice(id, price);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }

    // ─────────────────────────────────────────────
    // Task 5 — Update Product Quantity
    // ─────────────────────────────────────────────
    private static void updateQuantity() {
        System.out.println("\n--- Update Product Quantity ---");
        try {
            System.out.print("Enter Product ID    : ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter New Quantity  : ");
            int qty = Integer.parseInt(scanner.nextLine().trim());

            dao.updateQuantity(id, qty);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }

    // ─────────────────────────────────────────────
    // Task 6 — Delete Product
    // ─────────────────────────────────────────────
    private static void deleteProduct() {
        System.out.println("\n--- Delete Product ---");
        try {
            System.out.print("Enter Product ID: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            dao.deleteProduct(id);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid ID format.");
        }
    }

    // ─────────────────────────────────────────────
    // Task 7 — Search Product By Name
    // ─────────────────────────────────────────────
    private static void searchByName() {
        System.out.println("\n--- Search Product By Name ---");
        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine().trim();

        List<Product> results = dao.searchByName(keyword);
        if (results.isEmpty()) {
            System.out.println("No products found matching: " + keyword);
        } else {
            printHeader();
            results.forEach(p -> System.out.println(p));
        }
    }

    // ─────────────────────────────────────────────
    // Task 8 — Low Stock Alert
    // ─────────────────────────────────────────────
    private static void showLowStock() {
        System.out.println("\nLow Stock Products");
        System.out.printf("%-5s %-20s %-5s%n", "ID", "Name", "Qty");
        System.out.println("-".repeat(32));

        List<Product> lowStock = dao.getLowStockProducts();
        if (lowStock.isEmpty()) {
            System.out.println("All products are sufficiently stocked.");
        } else {
            lowStock.forEach(p ->
                    System.out.printf("%-5d %-20s %-5d%n",
                            p.getProductId(), p.getProductName(), p.getQuantity()));
        }
    }

    // ─────────────────────────────────────────────
    // BONUS — Sort By Price
    // ─────────────────────────────────────────────
    private static void sortByPrice() {
        System.out.println("\n--- Products Sorted By Price (Ascending) ---");
        List<Product> products = dao.getProductsSortedByPrice();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            printHeader();
            products.forEach(p -> System.out.println(p));
        }
    }

    // ─────────────────────────────────────────────
    // BONUS — Top Rated Products
    // ─────────────────────────────────────────────
    private static void topRatedProducts() {
        System.out.println("\n--- Top Rated Products (Rating >= 4.5) ---");
        List<Product> products = dao.getTopRatedProducts();
        if (products.isEmpty()) {
            System.out.println("No top-rated products found.");
        } else {
            printHeader();
            products.forEach(p -> System.out.println(p));
        }
    }

    // ─────────────────────────────────────────────
    // BONUS — Total Inventory Value
    // ─────────────────────────────────────────────
    private static void totalInventoryValue() {
        double total = dao.getTotalInventoryValue();
        System.out.printf("%nTotal Inventory Value: %.2f%n", total);
    }

    // ─────────────────────────────────────────────
    // Helper — Print table header
    // ─────────────────────────────────────────────
    private static void printHeader() {
        System.out.printf("%-5s %-20s %-15s %-10s %-5s %-6s%n",
                "ID", "Name", "Category", "Price", "Qty", "Rating");
        System.out.println("-".repeat(65));
    }
}
