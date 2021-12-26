package ru.gb;

public class Cat extends Creature {
    private int runDistance;
    private int climbHeight;


    public Cat(int runDistance, int climbHeight) {
        this.runDistance = runDistance;
        this.climbHeight = climbHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getClimbHeight() {
        return climbHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
