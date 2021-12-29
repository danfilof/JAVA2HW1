package ru.gb;

public class Wall implements Obstacles {
    private Integer Height;

    public Wall (Integer WallHeight){
        this.Height = WallHeight;
    }

    @Override
    public Boolean Execute (String Subject, Integer MaxHeight, Integer MaxDistance) {
        if (MaxHeight<Height) {
            System.out.println(Subject + " jumped successfully");
            return false;
        } else {
            System.out.println(Subject + " failed to jump");
            return true;
        }
    }
}

 

