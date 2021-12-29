package ru.gb;

public class Human implements Creature {
    private Integer MyJump;
    private Integer MyRun;
    private String name;

    public Human (String name,int MyJump, int MyRun){
        this.MyJump = MyJump;
        this.MyRun = MyRun;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return "Human";
    }

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }

    @Override
    public void run() {
        System.out.println("Human runs");
    }

    public Integer getMyJump() {
        return MyJump;
    }

    public Integer getMyRun() {
        return MyRun;
    }}
