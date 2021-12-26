package ru.gb;

public class RunningTrack {
    private int distanceToRun = 30;
    private boolean hasRun;


    public boolean runOver(Creature c) {

        if (distanceToRun >= c.getRunDistance()) {
            return hasRun = true;
        } else {
            return hasRun = false;
        }
    }

    public void printHasClimbed () {
        if (hasRun = true) {
            System.out.println("has run");
        } else {
            System.out.println("has not run");
        }
    }

}
