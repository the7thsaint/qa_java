package com.example;

public interface IFelines  {
    Feline feline = new Feline();
     default int getKittens(int kittensCount) {
        return kittensCount;
    }
     default int getKittens() {
        return getKittens();
    }
}
