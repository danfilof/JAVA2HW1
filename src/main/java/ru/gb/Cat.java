package ru.gb;

public class Cat implements Creature {
    private Integer MyJump;
    private Integer MyRun;
    private String name;

    public Cat (String name, int MyJump, int MyRun){
        this.MyJump = MyJump;
        this.MyRun = MyRun;
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
