package com.javatest;

public interface CaterpillarInterface extends AnimalInterface{
    default void swim(){
        throw new UnsupportedOperationException("Caterpillar cannot swim");
    }

    default void fly(){
        throw new UnsupportedOperationException("Caterpillar cannot fly");
    }

    default void sing(){
        throw new UnsupportedOperationException("Caterpillar cannot sing");
    }
}
