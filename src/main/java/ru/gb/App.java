package ru.gb;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5,5);
        Human human1 = new Human(30,15);
        Robot robot1 = new Robot(60,0);

        robot1.jump();
        human1.run();

    }
}
