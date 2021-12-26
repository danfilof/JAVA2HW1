package ru.gb;

public class Human extends Creature {
    private int runDistance;
    private int climbHeight;


    public Human (int runDistance, int climbHeight) {
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
        System.out.println("Human jumps");
    }

    @Override
    public void run() {
        System.out.println("Human runs");
    }
}
