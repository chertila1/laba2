package com.company;
import ru.ifmo.se.pokemon.*;

public class Shelgon extends Bagon {
    public Shelgon(String name, int level) {
        super(name, level);
        this.setMove(new Blizzard(), new DoubleTeam(), new Slam());
        this.setType(Type.DRAGON);
        this.setStats(65,95,100,60,50,50);
    }
}
