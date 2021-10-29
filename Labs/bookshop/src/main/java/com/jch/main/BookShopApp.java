package com.jch.main;

import com.jch.books.Address;
import com.jch.books.Author;
import com.jch.books.Book;
import com.jch.books.Publisher;
import com.jch.books.Sales;

/**
 * Simple class that provides the entry point
 * to the Bookshop application.
 */
public class BookShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Bookshop");
        System.out.println("============================");

        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress, "Romance");

        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Tech Books Publishing Ltd.",
                        publisherAddress);

        Book book = new Book("Java Unleashed",
                author, publisher, 15.95);
        System.out.println("Book: " + book);

        System.out.println("Calculating the Sales Discount price");
        book.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " +
                book.calculateSalePrice());

        Book book2 = new Book("Java For Professionals", author,
                publisher, 12.55);
        System.out.println("\nBook2: " + book2);
        System.out.println("Book Instance Count: " + Book.getCount());

        Sales salesProduct = book;
        salesProduct.setSaleDiscount(20.0);
        System.out.println("Sale price of book: " +
                salesProduct.calculateSalePrice());

        author.prettyPrint();
        publisher.prettyPrint();

    }
}