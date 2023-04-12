package org.example.parasites;

public class Flea implements Parasite, Cloneable {

    private String type;

    public Flea(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Parasite clone() {
        try {
            return (Parasite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String beat() {
        return "Krovosisya";
    }

    @Override
    public String toString() {
        return "Flea type " + type ;
    }
}
