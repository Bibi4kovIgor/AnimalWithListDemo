package org.example;

import org.example.animal.*;
import org.example.list.ArrayList;
import org.example.list.List;
import org.example.parasites.Clab;
import org.example.parasites.Flea;
import org.example.parasites.Fly;
import org.example.parasites.Parasite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Parasite clob  = new Clab();
        Parasite flea = new Flea("flea");
        Parasite fly = new Fly();

        Pet dog = new Dog("four paws", "short wool", "Tuzik", flea);
        Pet cat = new Cat("four paws", "smoose wool", 1, "Musia", clob);
        Pet cat1 = new Cat("four paws", "smoose wool", 1, "Musia");

        cat.print();
        cat1.print();
        dog.print();

        List<Animal> animalCollection = new ArrayList<>(2);
        animalCollection.addAll(new Animal[]{dog, cat});
        System.out.println(Arrays.toString(animalCollection.getArray()));
        System.out.println(animalCollection.getSize());
        System.out.println(animalCollection.getElementByIndex(0));


        List<Parasite> parasiteList = new ArrayList<>(new Parasite[]{clob, flea, fly});
        for (int i = 0; i < parasiteList.getSize(); i++) {
            System.out.print(parasiteList.getElementByIndex(i).beat() + " ");
            System.out.println(parasiteList.getElementByIndex(i));
        }

        Printable printable = () -> System.out.println("Some print");

        Pet hedgehog = new Pet("4 paws", "hard wool", "Petya") {
            @Override
            public String say() {
                return "Frr";
            }

            @Override
            public String eat() {
                return "fly";
            }
        };
        hedgehog.print();

        printable.printDefault(hedgehog);

        // Типи поліморфізму
        // https://stackoverflow.com/questions/837864/java-overloading-vs-overriding
       // 1. Overwrite - перезапис використання Generics (Template "T") - механізм відкладеної імплементації
       // 2. Override - перевизначення - декілька класів, що реалізують інтерфейс
        // або наслідуються від абстрактного класу
       // 3. Overload - перевантаження - 1 клас і декілька функцій, що відрізняються к-тю
        // та/або типами вхідних пвараметрів



    }
}