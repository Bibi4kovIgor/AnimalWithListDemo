package org.example.parasites;

public class Fly implements Parasite {

    @Override
    public String toString() {
        return "just fly" + " " + PARASITE_QUANTITY;
    }

}
