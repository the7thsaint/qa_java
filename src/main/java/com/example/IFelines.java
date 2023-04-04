package com.example;

public interface IFelines  {
     default int getKittens(int kittensCount) {
        return kittensCount;
    }
     default int getKittens() {
        return getKittens();
    }
}
