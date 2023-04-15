package org.example.animal;

import org.example.parasites.Parasite;

import java.util.Objects;

public abstract class Pet extends Animal implements Printable {

    protected final String nickName;
    protected Parasite parasite;

    public Pet( String paws, String wool, String nickName, Parasite parasite) {
        super(paws, wool);
        this.nickName = nickName;
        this.parasite = parasite;
    }

    public Pet(String paws, String wool, String nickname) {
        this.paws = paws;
        this.wool = wool;
        this.nickName = nickname;
    }


    protected Parasite getParasite() {
        return parasite;
    }

    @Override
    public void print() {
        System.out.printf("Pets nick name %s, has parasite %s\n", nickName,
                Objects.nonNull(parasite) ? parasite.beat() : "No parasites");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                ", parasite=" + parasite +
                ", paws='" + paws + '\'' +
                ", wool='" + wool + '\'' +
                '}';
    }
}
