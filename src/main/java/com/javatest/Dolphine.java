package com.javatest;

public class Dolphine implements AnimalInterface {

    public void walk() {
        throw new UnsupportedOperationException("Dolphine cannot walk");
    }

    public void fly() {
        throw new UnsupportedOperationException("Dolphine cannot fly");
    }

    public void sing() {
        throw new UnsupportedOperationException("Dolphine cannot sing");
    }

}
