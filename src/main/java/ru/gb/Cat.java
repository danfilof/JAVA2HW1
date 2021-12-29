package ru.gb;

public class Cat implements Creature {
    private Integer MyJump;
    private Integer MyRun;
    private String name;

    public Cat (String name){
        this.MyJump = 200;
        this.MyRun = 50;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return "Cat";
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " jumps");
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " runs");
    }

    public Integer getMyJump() {
        return MyJump;
    }

    public Integer getMyRun() {
        return MyRun;
    }
}
