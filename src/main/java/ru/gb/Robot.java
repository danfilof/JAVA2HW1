package ru.gb;

public class Robot implements Creature {
    @Override
    public void jump() {
        System.out.println("Robot jumps");
    }

    @Override
    public void run() {
        System.out.println("Robot runs");
    }
}
