package com.javatest;

public class Parrot implements BirdInterface {

    private SoundsLike soundsLike;

    private AnimalInterface animalInterface;

    public Parrot() {
        this.soundsLike = SoundsLike.ROOSTER;
        animalInterface = SoundFactory.create(soundsLike);
    }

    public Parrot(SoundsLike soundsLike) {
        this.soundsLike = soundsLike;
        animalInterface = SoundFactory.create(soundsLike);
    }

    public void sing() {
        animalInterface.sing();
    }
}
