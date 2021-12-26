package ru.gb;

public class Wall {
    private int heightToClimb = 6;
    private boolean hasClimbed;


    public boolean climbOver(Creature c) {

       if (heightToClimb >= c.getClimbHeight()) {
           return hasClimbed = true;
       } else {
           return hasClimbed = false;
       }
    }

    public void printHasClimbed () {
        if (hasClimbed = true) {
            System.out.println("has jumped");
        } else {
            System.out.println("has not jumped");
        }
    }
}
