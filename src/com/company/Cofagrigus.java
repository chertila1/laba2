package com.company;
import ru.ifmo.se.pokemon.*;

public class Cofagrigus extends Yamask {
    public Cofagrigus(String name, int level) {
        super(name, level);
        this.setMove(new SwordsDance(), new Facade(), new RockSlide(), new CrushClaw());
        this.setType(Type.GHOST);
        this.setStats(58,50,145,95,105,30);
    }
}
