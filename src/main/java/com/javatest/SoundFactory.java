package com.javatest;

public class SoundFactory {
    public static AnimalInterface create(SoundsLike soundsLike) {
        AnimalInterface animalInterface;
        switch (soundsLike) {
            case CAT:
                animalInterface = new Cat();
                break;
            case DOG:
                animalInterface = new Dog();
                break;
            case ROOSTER:
                animalInterface = new Chicken(ChickenType.ROOSTER);
                break;
            default:
                throw new IllegalArgumentException("Implementation not found for " + soundsLike);
        }
        return animalInterface;
    }
}
