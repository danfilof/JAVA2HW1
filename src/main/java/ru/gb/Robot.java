package ru.gb;

public class Robot implements Creature {
    private int runDistance;
    private int climbHeight;


    public Robot (int runDistance, int climbHeight) {
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
        System.out.println("Robot jumps");
    }

    @Override
    public void run() {
        System.out.println("Robot runs");
    }
}
