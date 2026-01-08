package com.eli.tpjava;

public class Cat extends Animal implements Wild {
    public Cat(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void hunt() {
        System.out.println(name + " chasse.");
    }
}
