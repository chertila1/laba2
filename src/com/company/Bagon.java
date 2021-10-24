package com.company;
import ru.ifmo.se.pokemon.*;

public class Bagon extends Pokemon {
    public Bagon(String name, int level){
        super(name, level);
        this.setMove(new Blizzard(), new DoubleTeam());
        this.setType(Type.DRAGON);
        this.setStats(45,75,60,40,30,50);
    }
}
