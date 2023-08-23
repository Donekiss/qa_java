package com.example;

import java.util.List;

public class Lion{
    private Feline feline;

    public  Lion(Feline feline) {
        this.feline = feline;
    }
    private boolean hasMane;

    public Lion(Feline feline, String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> eatMeat() throws Exception {
        return feline.getFood("Хищник");
    }
}
