package com.eli.tpjava;

public class Dog extends Animal {
    public Dog(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void eat() {
        System.out.println("Il mange de la viande.");
    }
}
