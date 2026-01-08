package com.eli.tpjava;

public class Dog extends Animal implements Pet {
    public Dog(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void eat() {
        System.out.println(name + " mange de la viande.");
    }

    @Override
    public void play() {
        System.out.println(name + " joue à la balle");
    }
}
