package org.example.parasites;

public class Clab implements Parasite {
    @Override
    public String beat() {
        return "insect";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Clab";
    }
}
