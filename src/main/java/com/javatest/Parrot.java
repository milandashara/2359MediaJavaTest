package com.javatest;

public class Parrot implements BirdInterface{

    private SoundsLike soundsLike;

    private AnimalInterface animalInterface;

    public Parrot(SoundsLike soundsLike) {
        this.soundsLike = soundsLike;
        switch (soundsLike){
            case CAT:
                animalInterface = new Cat();
                break;
            case DOG:
                animalInterface = new Dog();
                break;
            case ROOSTER:
                animalInterface = new Chicken(ChickenType.ROOSTER);
        }
    }

    public void sing(){
        animalInterface.sing();
    }
}
