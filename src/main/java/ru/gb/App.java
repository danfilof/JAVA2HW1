package ru.gb;

public class App {
    public static void main(String[] args) {

        Creature[] creatures = {
                new Human("Anton",150,100),
                new Cat("Boriska",200,50),
                new Robot("Siri",50,1000)
        };

        Obstacles[] obstacles = {
                new Wall(100),
                new runningTrack(200)
        };

        for (Creature creature : creatures) {
            for (Obstacles obstacle : obstacles) {
                obstacle.Execute(creature.getType() + " " + creature.getName(), creature.getMyJump(), creature.getMyRun());
            }
        }
    }
}
