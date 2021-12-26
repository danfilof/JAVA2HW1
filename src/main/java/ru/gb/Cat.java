package ru.gb;

public class Cat implements Creature {
    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
