package ru.gb;

public class App {
    public static void main(String[] args) {

        Creature[] creatures = {
                new Human(20, 5),
                new Cat(2,3),
                new Robot(22,7)


        };

        for (Creature creature : creatures) {
            creature.jump();
            creature.run();
        }
    }
}
