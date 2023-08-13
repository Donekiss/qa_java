package com.example;

import java.util.List;

public class Lion extends Animal implements AnimalActions {

    boolean hasMane;

    public Lion(Lion animalLion, String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }

    @Override
    public int getKittens() {
        return 1;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
}
