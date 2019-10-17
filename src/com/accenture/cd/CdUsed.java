package com.accenture.cd;

public class CdUsed extends Cd {

    private final double USED_CD_DISCOUNT = 0.10;

    public CdUsed(String name, String genre, String description, int numSongs, double price){
        super(name, genre, description, numSongs, price);
    }
}
