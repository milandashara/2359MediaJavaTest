package com.javatest;

public class Solution {
    public static void main(String[] args) {
//        BirdInterface bird = new Bird();
//        bird.walk();
//        bird.fly();
//        bird.sing();

        AnimalInterface[] animals = new AnimalInterface[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Chicken(ChickenType.ROOSTER),
                new Parrot(),
                new Fish(),
                new SharkFish(),
                new ClownFish(),
                new Dolphine(),
                new Frog(),
                new Dog(),
                new ButterFly(),
                new Cat()
        };

        System.out.println("Fly Count " + getFlyCount(animals));
        System.out.println("Swim Count " + getSwimCount(animals));
        System.out.println("Sing Count " + getSingCount(animals));
        System.out.println("Walk Count " + getWalkCount(animals));


    }

    public static int getFlyCount(AnimalInterface[] animalInterfaces) {

        int count = 0;
        for (AnimalInterface animalInterface : animalInterfaces) {
            try {
                animalInterface.fly();
                count++;
            } catch (UnsupportedOperationException e) {

            }
        }
        return count;
    }

    public static int getWalkCount(AnimalInterface[] animalInterfaces) {

        int count = 0;
        for (AnimalInterface animalInterface : animalInterfaces) {
            try {
                animalInterface.walk();
                count++;
            } catch (UnsupportedOperationException e) {

            }
        }
        return count;
    }

    public static int getSingCount(AnimalInterface[] animalInterfaces) {

        int count = 0;
        for (AnimalInterface animalInterface : animalInterfaces) {
            try {
                animalInterface.sing();
                count++;
            } catch (UnsupportedOperationException e) {

            }
        }
        return count;
    }

    public static int getSwimCount(AnimalInterface[] animalInterfaces) {

        int count = 0;
        for (AnimalInterface animalInterface : animalInterfaces) {
            try {
                animalInterface.swim();
                count++;
            } catch (UnsupportedOperationException e) {

            }
        }
        return count;
    }


}