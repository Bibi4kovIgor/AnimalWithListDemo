package org.example.animal;

@FunctionalInterface
public interface Printable {
    void print();

    default void printDefault(Animal animal){
        System.out.println(animal);
    }
}
