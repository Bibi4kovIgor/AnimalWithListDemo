package org.example.animal;

import org.example.parasites.Parasite;

public class Dog extends Pet {

    public Dog(String paws, String wool, String nickName, Parasite parasite) {
        super(paws, wool, nickName, parasite);
    }


    @Override
    public String say() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Meal";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "parasite=" + getParasite() +
                ", paws='" + paws + '\'' +
                ", wool='" + wool + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.printf("Dog nickname %s, say %s, eats %s\n",
                           nickName, say(), eat());
    }
}
