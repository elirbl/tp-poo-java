package com.eli.tpjava;

public class Animal {
    String name;
    int age;
    String sound;

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

    Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
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
}
