package com.javatest;

public interface FishInterface extends AnimalInterface {
    default void fly(){
        throw new UnsupportedOperationException("Fish cannot fly");
    }

    default void walk(){
        throw new UnsupportedOperationException("Fish cannot walk");
    }

    default void sing(){
        throw new UnsupportedOperationException("Fish cannot sing");
    }

}
