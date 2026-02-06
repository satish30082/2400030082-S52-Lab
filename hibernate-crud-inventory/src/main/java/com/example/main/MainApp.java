package com.example.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.entity.Product;
import com.example.util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== PRODUCT MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct(sc);
                    break;

                case 2:
                    viewProducts();
                    break;

                case 3:
                    deleteProduct(sc);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    HibernateUtil.getSessionFactory().close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ---------------- ADD PRODUCT ----------------
    private static void addProduct(Scanner sc) {
        System.out.print("Enter product name: ");
        String name = sc.next();

        System.out.print("Enter description: ");
        String desc = sc.next();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p = new Product(name, desc, price, qty);
        session.save(p);

        tx.commit();
        session.close();

        System.out.println("✔ Product added successfully!");
    }

    // ---------------- VIEW PRODUCTS ----------------
    private static void viewProducts() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Product> list = session.createQuery("from Product", Product.class).list();

        System.out.println("\n--- PRODUCT LIST ---");
        for (Product p : list) {
            System.out.println(
                "ID: " + p.getId() +
                " | Name: " + p.getName() +
                " | Price: " + p.getPrice() +
                " | Qty: " + p.getQuantity()
            );
        }

        session.close();
    }

    // ---------------- DELETE PRODUCT ----------------
    private static void deleteProduct(Scanner sc) {
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p = session.get(Product.class, (long) id);
        if (p != null) {
            session.delete(p);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found!");
        }

        tx.commit();
        session.close();
    }
}
