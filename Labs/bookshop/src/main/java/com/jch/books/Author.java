package com.jch.books;

public class Author extends Person implements PrettyPrinter {
    private String genre;

    public Author(String name, Address address, String genre) {
        super(name, address);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void prettyPrint(){ System.out.printf("Publisher [name=%s, address=%s, genre=%s]", getName(), getAddress(), genre);};

    @Override
    public String toString() {
        return String.format("Author [name=%s, address=%s, genre=%s]", getName(), getAddress(), genre);
    }
}
