package com.jch.books;

public class Publisher {
    private String name;
    private Address address;
    private String organisation;

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Publisher(String name, Address address, String organisation) {
        this.name = name;
        this.address = address;
        this.organisation = organisation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void prettyPrint(){ System.out.printf("Publisher [name=%s, address=%s]", name, address);};

    @Override
    public String toString(){
        return String.format("Publisher [name=%s, address=%s]", name, address);
    }
}
