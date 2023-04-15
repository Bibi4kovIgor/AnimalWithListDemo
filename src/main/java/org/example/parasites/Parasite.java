package org.example.parasites;

public interface Parasite extends Cloneable {
    default String beat(){
        return "was beaten";
    }

    int PARASITE_QUANTITY = 2; // static final



}
