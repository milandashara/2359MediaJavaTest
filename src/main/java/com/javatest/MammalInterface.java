package com.javatest;

public interface MammalInterface extends AnimalInterface {
    default void fly() {
        throw new UnsupportedOperationException("Mammal cannot fly");
    }
}
