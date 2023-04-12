package org.example.animal;

public abstract class Animal {
    protected String paws;
    protected String wool;

    public Animal(String paws, String wool) {
        this.paws = paws;
        this.wool = wool;
    }

    public Animal() {
    }

    public abstract String say();
    public abstract String eat();
}
