package ru.gb;

import javax.naming.Name;

public interface Creature extends Jumpable, Runable {
    Integer getMyJump();
    Integer getMyRun();
    String getName();
    String getType();
}


