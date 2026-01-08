package com.eli.tpjava;

public class Cow extends Animal implements Pet {
    public Cow(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void play() {
        System.out.println(name + " joue dans le pré.");
    }
}
