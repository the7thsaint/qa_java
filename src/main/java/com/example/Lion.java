package com.example;

import java.util.List;

public class Lion extends Animal implements IFelines {
    private IFelines felines;
    public Lion(IFelines felines){
        this.felines = felines;
    }

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return felines.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
