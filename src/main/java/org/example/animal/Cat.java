package org.example.animal;

import org.example.parasites.Parasite;

final public class Cat extends Pet {

    private int nightVision;

    public Cat(String paws, String wool, int nightVision, String nickname, Parasite parasite) {
        super(paws, wool, nickname, parasite);
        this.nightVision = nightVision;
    }

    @Override
    public String say() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "cat food";
    }

    public void play(){
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nightVision=" + nightVision +
                ", paws='" + paws + '\'' +
                ", wool='" + wool + '\'' +
                ", parasite ='" + getParasite() + '\'' +
                '}';
    }
}
