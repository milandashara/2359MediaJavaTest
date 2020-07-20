package com.javatest;

public class Chicken implements BirdInterface {

    private ChickenType chickenType;

    public Chicken(){
        this.chickenType = ChickenType.HEN;
    }

    public Chicken(ChickenType type){
        this.chickenType = type;
    }

    public void sing() {
        switch (this.chickenType){
            case HEN:
                System.out.println("Cluck, cluck");
                break;
            case ROOSTER:
                System.out.println("Cock-a-doodle-doo");
                break;
        }

    }
}
