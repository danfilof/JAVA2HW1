package ru.gb;

public class runningTrack implements Obstacles {
    private Integer Distance;

    public runningTrack (Integer TrackLength) {
        this.Distance = TrackLength;
    }

    @Override
    public Boolean Execute (String Subject, Integer MaxHeight, Integer MaxDistance) {
        if (MaxDistance<Distance) {
            System.out.println(Subject + " ran successfully");
            return false;
        } else {
            System.out.println(Subject + " failed to run");
            return true;
        }
    }
}
