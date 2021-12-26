package ru.gb;

public class Human implements Creature {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }

    @Override
    public void run() {
        System.out.println("Human runs");
    }
}
