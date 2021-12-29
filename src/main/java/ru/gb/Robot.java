package ru.gb;

public class Robot implements Creature {
    private Integer MyJump;
    private Integer MyRun;
    private String name;

    public Robot (String name){
        this.MyJump = 50;
        this.MyRun = 1000;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return "Robot";
    }

    @Override
    public void jump() {
        System.out.println("Robot jumps");
    }

    @Override
    public void run() {
        System.out.println("Robot runs");
    }

    public Integer getMyJump() {
        return MyJump;
    }

    public Integer getMyRun() {
        return MyRun;
    }}
