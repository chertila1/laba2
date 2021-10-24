package com.company;
import ru.ifmo.se.pokemon.*;

public class Salamence extends Shelgon {
    public Salamence(String name, int level) {
        super(name, level);
        this.setMove(new Blizzard(), new DoubleTeam(), new Slam(), new SignalBeam());
        this.setType(Type.DRAGON, Type.FLYING);
        this.setStats(95,135,80,110,80,100);
    }
}
