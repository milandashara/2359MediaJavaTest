package com.javatest;

interface BirdInterface extends AnimalInterface {
    default void swim(){
        throw new UnsupportedOperationException("Bird cannot swim");
    }
}
