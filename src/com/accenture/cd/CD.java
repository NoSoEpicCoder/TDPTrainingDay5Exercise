package com.accenture.cd;

public abstract class CD {

    private static int id;
    private int iterator = 1;
    protected String name;
    protected String genre;
    protected String description;
    protected double price;
    public static final String SEARCH_NAME = "NAME";
    public static final String SEARCH_GENRE = "GENRE";
    public static final String SEARCH_DESCRIPTION = "DESCRIPTION";

    public CD(String name, String genre, String description, double price){
        id = iterator;
        iterator++;
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "ID: " +getId()+ ", Name: " +getName()+ ", Genre: " +getGenre()+ ", Description: " +getDescription();
    }
}
