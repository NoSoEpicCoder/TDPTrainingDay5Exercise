package com.accenture.book;

//Default class for all books, the class has to be modified by the child to be used
//you cannot create a Book object
public abstract class Book {
    protected static int iterator = 1;
    protected int id;
    protected String name;
    protected String description;
    protected double price;
    public static final String SEARCH_ID = "ID";
    public static final String SEARCH_NAME = "NAME";
    public static final String SEARCH_DESCRIPTION = "DESCRIPTION";


    public Book(String name, String description, double price){
        id = iterator;
        iterator++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){this.price = price;}

    public String toString(){
        return "ID: " +getId()+ ", Name: " +getName()+ ", Description: " +getDescription()+ ", Price: " +getPrice();
    }
}
