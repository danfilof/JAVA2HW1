package ru.gb;

public class Creature implements Jumpable, Runable {
    private int runDistance;
    private int climbHeight;

    public int getRunDistance() {
        return runDistance;
    }

    public int getClimbHeight() {
        return climbHeight;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}



