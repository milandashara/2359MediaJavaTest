package com.javatest;

interface Animal {
    default void walk() {
        System.out.println("I am walking");
    }

    default void sing() {
        System.out.println("I am singing");
    }

    default void fly() {
        System.out.println("I am flying");
    }
}