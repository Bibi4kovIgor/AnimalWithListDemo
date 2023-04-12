package org.example.animal;

import org.example.animal.Animal;
import org.example.parasites.Parasite;

public abstract class Pet extends Animal {
    private String nickName;
    private final Parasite parasite;

    public Pet( String paws, String wool, String nickName, Parasite parasite) {
        super(paws, wool);
        this.nickName = nickName;
        this.parasite = parasite;
    }

    protected Parasite getParasite() {
        return parasite;
    }
}
