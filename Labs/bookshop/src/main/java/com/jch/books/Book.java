package com.jch.books;

/**
 * Represents a Book with a title, author, publisher and a price.
 */
public class Book extends Product implements Sales {

    private Author author;
    private Publisher publisher;
    public static int count = 0;


    public Book(String title, Author author, Publisher publisher, double price) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
        count ++;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void printer(){
        System.out.println("Book - printer");
    };

    @Override
    public String toString() {
        return String.format("Book [title=%s, author=%s, publisher=%s, price=%s]", getTitle(), author, publisher, getPrice());
    }

}
