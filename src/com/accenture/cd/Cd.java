package com.accenture.cd;

public abstract class Cd {

    private static int id;
    private int iterator = 1;
    protected String name;
    protected String genre;
    protected String description;
    protected int numSongs;
    protected double price;

    public Cd(String name, String genre, String description, int numSongs, double price){
        id = iterator;
        iterator++;
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.numSongs = numSongs;
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

    public int getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "ID: " +getId()+ ", Name: " +getName()+ ", Genre: " +getGenre()+ ", Description: " +getDescription()+ ", Number of songs:" +getNumSongs();
    }
}
