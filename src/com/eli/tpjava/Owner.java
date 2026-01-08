package com.eli.tpjava;

public class Owner {
    private String name;
    private Pet[] petList;
    public Owner(String name, Pet[] petList) {
        this.name = name;
        this.petList = petList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Pet[] getPetList() {
        return petList;
    }
    public void setPetList(Pet[] petList) {
        this.petList = petList;
    }
}
