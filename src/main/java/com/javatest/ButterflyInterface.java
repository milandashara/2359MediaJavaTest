package com.javatest;

public interface ButterflyInterface extends AnimalInterface{

    default void swim(){
        throw new UnsupportedOperationException("ButterFly cannot swim");
    }

    default void walk(){
        throw new UnsupportedOperationException("ButterFly cannot walk");
    }

    default void sing(){
        throw new UnsupportedOperationException("ButterFly cannot sing");
    }
}
