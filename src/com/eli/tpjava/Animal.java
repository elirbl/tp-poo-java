package com.eli.tpjava;

public class Animal {
    protected String name;
    protected int age;
    protected String sound;
    private int nbEyes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNbEyes() {
        return nbEyes;
    }

    Animal(String name, int age, String sound, int nbEyes) {
        this.name = name;
        this.age = age;
        this.sound = sound;
        this.nbEyes = 2;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public static void needs() {
        System.out.println("Un animal doit manger et boire.");
    }

    public void eat() {
        System.out.println("Il mange.");
    }

    public void eat(String food) {
        System.out.println("Il mange " + food + ".");
    }
}
